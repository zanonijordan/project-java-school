package mws_2018_039.testexception2;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("-------- START --------");
        System.out.println("Inserisci email destinatario:");
        Scanner sc = new Scanner(System.in);
        String dst = sc.next();
        
        try {
            inviaEmail(dst);
        } catch (IndirizzoNonValidoException ex) {
           System.out.println("indirizzo non valido");
        }
        System.out.println("-------- STOP  --------");
    }   
    private static void inviaEmail(String e ) throws IndirizzoNonValidoException {
        if (!e.contains("@")) throw new IndirizzoNonValidoException();
        if (!e.contains(".")) throw new IndirizzoNonValidoException();
        
        System.out.println("Invio messaggio d'allerta meteo a: "+ e );  
    }
    
}
