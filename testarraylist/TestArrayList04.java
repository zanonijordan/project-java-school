package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class TestArrayList04 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        
        l1.add( "ciao" );
        l1.add( "miao" );
        l1.add( "etc" );
        
        l2.add("elle due 1");
        l2.add("elle due 2");
        l2.add("elle due 3");
        l2.addAll( 1, l1 );
        
        System.out.println(" ->> " + l2.contains("elle due 1"));
        
    }
}
