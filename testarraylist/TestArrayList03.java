package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class TestArrayList03 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> e = new ArrayList<>();
        
        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(3);
        r1.add(6);
        
        ArrayList<Integer> r2 = new ArrayList<>();
        r2.add(-2);
        r2.add(226);
        r2.add(45);
        
        e.add(r1);
        e.add(r2);
        e.add( new ArrayList<>() );
    }
}
