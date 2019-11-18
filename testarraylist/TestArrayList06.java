package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class TestArrayList06 {
    public static void main(String[] args) {
        Studente s1 = new Studente("Lele",     "Rizzo",      "RZZMNL");
        Studente s2 = new Studente("Emanuele", "Rizzo",      "RZZMNL");
        Studente s3 = new Studente("Ema",      "Rizzarelli", "RZZMNL");
        
        ArrayList<Studente> e = new ArrayList<>();
        e.add( s2 );
        e.add( s1 );
        e.add( s3 );
        
        Studente test = new Studente("Lele", "Rizzo",      "RZZMNL");
        
        System.out.println("---> "+ e.contains( test ));
        System.out.println("---> "+ e.indexOf(test ));
        
        if( e!=null && !e.isEmpty() ){
            for( int i=0; i<e.size(); i++ ){
                System.out.println("- "+ e.get(i));
            }
        }
        
        e.remove( test );
        System.out.println("--------------------");
        if( e!=null && !e.isEmpty() ){
            for( int i=0; i<e.size(); i++ ){
                System.out.println("- "+ e.get(i));
            }
        }
    }
}
