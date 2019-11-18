package mws_2018_039.appstudenti.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import mws_2018_039.appstudenti.dto.StudenteDTO;
import static mws_2018_039.testsql.TestMySQL.conn_str;
import static mws_2018_039.testsql.TestMySQL.password;
import static mws_2018_039.testsql.TestMySQL.username;

public class TestMySQLInsert {
    public static void main(String[] args) {
        StudenteDTO stud = new StudenteDTO();
        stud.setNome("MMM");
        stud.setCognome("MMM");
        stud.setEta(44);
        stud.setMatricola("MMM");
        registraStudente( stud );
    }
    public static void registraStudente( StudenteDTO s ){
        
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
}
