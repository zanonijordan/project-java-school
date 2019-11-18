package mws_2018_039.appstudenti.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import mws_2018_039.appstudenti.dto.StudenteDTO;
import static mws_2018_039.testsql.TestMySQL.conn_str;
import static mws_2018_039.testsql.TestMySQL.password;
import static mws_2018_039.testsql.TestMySQL.username;

public class StudentiStorageMySQL implements IStudentiStorage{
    private static StudentiStorageMySQL INSTANCE = null;

    private StudentiStorageMySQL(){}
    public static StudentiStorageMySQL getInstance(){
        if( INSTANCE==null ) INSTANCE = new StudentiStorageMySQL();
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
            try (Connection conn = DriverManager.getConnection(conn_str, username, password)) {
                Statement st = conn.createStatement();
                System.out.println("executing: "+ query);
                int i = st.executeUpdate(query);

                System.out.println("record modificati: "+ i);
            }
        } catch (Exception e){
            System.out.println("Errore: "+e);
        } 
    }

    @Override
    public ArrayList<StudenteDTO> caricaElencoStudenti() {
        ArrayList<StudenteDTO> retList = new ArrayList<>();
        
        try{    // poi gestiremo il rilancio dell'eccezione
            String query = "SELECT * FROM studenti";
            try (Connection c = DriverManager.getConnection(conn_str, username, password)) {
                Statement s = c.createStatement();
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
            }
        } catch( Exception e ){
            System.out.println("ERRORE: "+ e);
        }
        
        return retList;
    }
    
}
