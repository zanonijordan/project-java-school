package mws_2018_039.testif;

public class TestMain {
    public static void main(String[] args) {
        boolean seValido = controlloSesso("f") && controlloEta( 52 );
        System.out.println("esito: "+ seValido);
    }
    
    public static boolean controlloSesso( String s  ){
        System.out.println("controllo il sesso ....");
        return s.equals("M");
    }
    
    public static boolean controlloEta( Integer e ){
        System.out.println("controllo l'età....");
        Integer diciotto = new Integer(18);
        return e.compareTo(diciotto) > 0;
    }
}
