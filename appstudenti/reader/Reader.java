package mws_2018_039.appstudenti.reader;

import java.util.Scanner;

public class Reader {
    /** Smart */
    public int leggiInt( int min, int max, String label ){
        int val = min-1;
        Scanner sc = new Scanner(System.in);
        while( val<min ){
            try{
                System.out.print(label +": ");
                String valStr = sc.next();
                val = new Integer(valStr);
                if( val<min || val>max ) {
                    System.out.println("Non valida, deve essere compresa tra "+ min +" e "+ max);
                    val = min-1;
                }
            } catch (Exception e){
                System.out.println("Non valida");
                val = min-1;
                sc = new Scanner(System.in);
            }
        }
        return val;
    }
}
