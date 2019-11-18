package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class TestArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> e = new ArrayList<>();
        
        e.add("Lele");
        e.add("Ema");
        e.add("Lelino");
        e.add(1, "Secondo");
        
        for(int i=0; i<e.size(); i++){
            System.out.println("- "+ e.get( i ));
        }
        
        System.out.println("size: "+ e.size());
    }
}
