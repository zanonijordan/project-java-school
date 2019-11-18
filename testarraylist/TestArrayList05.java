package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class TestArrayList05 {
    public static void main(String[] args) {
        ArrayList<String> e = new ArrayList<>();
        e.add( "Lele" );
        e.add( "Lele" );
        e.add( "Ema" );
        e.add( null );
        e.add( null );
        e.add( null );
        
        for(int i=0; i<e.size(); i++){
            System.out.println("- "+ e.get(i));
        }
        e.set(3, "Emanuele");
        e.set(4, "Emanuele");
        e.set(5, "Emanuele");
        System.out.println("------ dopo ------ ");
        for(int i=0; i<e.size(); i++){
            System.out.println("- "+ e.get(i));
        }
        System.out.println("contiene elementi null? "+ e.contains(null));
    }
}
