package mws_2018_039.testarraylist;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String lista[] = new String[2];
        lista[0] = "lele";
        lista[1] = "manu";
        
        System.out.println("lista: "+ lista);
        
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("lele");
        l2.add("manu");
        System.out.println("l2: "+ l2);
    }
}
