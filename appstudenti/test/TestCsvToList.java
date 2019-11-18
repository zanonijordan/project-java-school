package mws_2018_039.appstudenti.test;

import java.util.ArrayList;

public class TestCsvToList {
    public static void main(String[] args) {
        String csv = "Rizzo;Lele;22;a1001\n" +
                     "Rossi;Mario;44;a1002";
        ArrayList<String> l = splitBy( csv, "\n" );
        for(String currRow : l){
            System.out.println( splitBy( currRow, ";") );
        }
    }
    
    public static ArrayList<String> splitBy( String str, String sep ){
        ArrayList<String> list = new ArrayList<>();
        
        int pos = str.indexOf( sep );
        while ( pos >= 0) {
            String elemento = str.substring(0, pos);
            list.add( elemento );
            str = str.substring(pos+sep.length());
            pos = str.indexOf( sep );
        }
        list.add( str );
        
        return list;
    }
}
