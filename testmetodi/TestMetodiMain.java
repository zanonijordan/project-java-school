package mws_2018_039.testmetodi;

import mws_2018_039.Studente;

public class TestMetodiMain {
    private static String nome;
    private static int eta;
    private static int numero = 2222;
    private static float importo = 12.00F;
    
    public static void main(String[] args) {
        int areaCalcolataDalProgramma = calcolaAreaRettangolo( 10, 5 );
        //System.out.println( "Risultato: "+ areaCalcolataDalProgramma + " mq");
        System.out.println("il valore float è: "+ importo);
    }
    
    public static void stampaMessaggio(){
        nome = "Emanuele";
        numero = 12;
    }
    
    public static int calcolaAreaRettangolo( int base, int altezza ){
        int area = base * altezza;
        return 789;
    }
    
    public static Studente dimmiChiVince(){
        Studente s = new Studente();
        
        return s;
    }
}
