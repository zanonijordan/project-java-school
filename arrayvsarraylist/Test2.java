package mws_2018_039.arrayvsarraylist;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> elenco = new ArrayList<>();
        elenco.add( "cioa" );
        elenco.add( "cidfoa" );
        elenco.add( "ciofga" );
        elenco.add( "ciosa" );
        elenco.add( "cfghdfioa" );
        
        System.out.println("----  for calssico  ----");
        for( int i=0; i<elenco.size(); i++){
            System.out.println("- "+ elenco.get(i));
        }
        
        
        System.out.println("----  foreach  ----");
        for (String s : elenco) {
            System.out.println("- "+ s);
        }
    }
}
