package mws_2018_039.testsql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class TestMySQL {
    public static String username = "mws_2018_039";
    public static String password = "java";
    public static String conn_str = "jdbc:mysql://localhost:3306/mws_2018_039";
    
    public static void main(String[] args) throws SQLException {
        long l = Calendar.getInstance().getTimeInMillis();
        
        Connection conn = DriverManager.getConnection(conn_str, username, password);
        System.out.println("");
        for( int i=0; i<10; i++){
            insert("lele_"+i, "rizzo", 30+i, conn);
        }
        if( conn!=null && !conn.isClosed()) conn.close();
        
        System.out.println("ho impegeto "+
                (Calendar.getInstance().getTimeInMillis()-l)
                +" ms");
    }
    
    public static void insert( String n, String c, int e,Connection conn ) throws SQLException{
        String query = "INSERT INTO studenti (nome,cognome,eta) "
                + "VALUES ("
                    + "'"+n+"',"
                    + "'"+c+"',"
                         +e+")";
            Statement s = conn.createStatement();
            //System.out.println("executing: "+ query);
            int i = s.executeUpdate(query);
            
            //System.out.println("record modificati: "+ i);
        
    }
    
    public static void insert( String n, String c, int e ) throws SQLException{
        String query = "INSERT INTO studenti (nome,cognome,eta) "
                + "VALUES ("
                    + "'"+n+"',"
                    + "'"+c+"',"
                         +e+")";
        try (Connection conn = DriverManager.getConnection(conn_str, username, password)) {
            Statement s = conn.createStatement();
            //System.out.println("executing: "+ query);
            int i = s.executeUpdate(query);
            
            //System.out.println("record modificati: "+ i);
        }
    }
    
    public static void select() throws SQLException{
        String query = "SELECT * FROM studenti WHERE eta > 30";
        try (Connection c = DriverManager.getConnection(conn_str, username, password)) {
            Statement s = c.createStatement();
            System.out.println("executing: "+ query);
            ResultSet r = s.executeQuery(query);
            
            while( r.next() ){
                System.out.println("----> "+ r.getString("nome") +" - "+ r.getInt("eta"));
            }
        }
    }
}
