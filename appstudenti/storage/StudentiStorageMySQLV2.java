package mws_2018_039.appstudenti.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mws_2018_039.appstudenti.dto.StudenteDTO;
import static mws_2018_039.testsql.TestMySQL.conn_str;
import static mws_2018_039.testsql.TestMySQL.password;
import static mws_2018_039.testsql.TestMySQL.username;

public class StudentiStorageMySQLV2 implements IStudentiStorage{
    private static StudentiStorageMySQLV2 INSTANCE = null;
    private Connection conn = null;

    private StudentiStorageMySQLV2(){
        try {
            System.out.print("\nAvvio connesione al DB...");
            this.conn = DriverManager.getConnection(conn_str, username, password);
            System.out.print("OK\n");
        } catch (SQLException ex) {
            System.out.print("ERROR DB NON ACCESSIBILE: "+ex+"\n");
        }
    }
    public static StudentiStorageMySQLV2 getInstance(){
        if( INSTANCE==null ) INSTANCE = new StudentiStorageMySQLV2();
        return INSTANCE;
    }
    
    @Override
    public void registraStudenti(ArrayList<StudenteDTO> l) {
        for (StudenteDTO currS : l) {
            registraStudente(currS);
        }
    }
    public void registraStudente( StudenteDTO s ){
        
        try{
            String query = "INSERT INTO studenti (nome,cognome,eta,matricola) "
                    + "VALUES ("
                        + "'"+s.getNome()+"',"
                        + "'"+s.getCognome()+"',"
                             +s.getEta()+","
                        + "'"+s.getMatricola()+"')";
            
            Statement st = conn.createStatement();
            System.out.println("executing: "+ query);
            int i = st.executeUpdate(query);

            System.out.println("record modificati: "+ i);
            
        } catch (Exception e){
            System.out.println("Errore: "+e);
        } 
    }

    @Override
    public ArrayList<StudenteDTO> caricaElencoStudenti() {
        ArrayList<StudenteDTO> retList = new ArrayList<>();
        
        try{    // poi gestiremo il rilancio dell'eccezione
            String query = "SELECT * FROM studenti";
            
            Statement s = conn.createStatement();
            System.out.println("executing: "+ query);
            ResultSet r = s.executeQuery(query);

            StudenteDTO currS;
            while( r.next() ){
                currS = new StudenteDTO();

                currS.setNome(      r.getString("nome"      ) );
                currS.setCognome(   r.getString("cognome"   ) );
                currS.setEta(       r.getInt(   "eta"       ) );
                currS.setMatricola( r.getString("matricola" ) );

                retList.add( currS );
            }
        } catch( Exception e ){
            System.out.println("ERRORE: "+ e);
        }
        
        return retList;
    }
    
}
