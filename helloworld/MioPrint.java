package mws_2018_039.helloworld;

public class MioPrint {
    public static void stampaRiga( String str ){
        System.out.println( str );
        stampaRiga2("...");
    }
    
    private static void stampaRiga2( String str ){
        System.out.println( str );
    }
    
    public static int moltiplicaPerTre( int a ){
        int risultato = 0;
        risultato = somma(risultato, a);
        risultato = somma(risultato, a);
        risultato = somma(risultato, a);
        
        // risultato = 0 + a + a + a
        
        return risultato;
    }
    private static int somma( int a, int b ){
        System.out.println("sommo "+ a + " con "+ b);
        return a+b;
    }
    
    public static int inviaMail(String dst, String obj, String msg){
        int esito = 0;
        System.out.println("invio mail a: "+ dst);
        System.out.println(" con oggetto: "+ obj);
        System.out.println(" e messaggio: "+ msg);
        
        esito = 1;
        
        return esito;
    }
}
