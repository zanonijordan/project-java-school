package mws_2018_039.helloworld;

public class HelloWorld {
    public static void main( String[] args ){
        float valEuro    = 100.00F;
        float valDollaro = 400.00F;
        
        float totEuro = valEuro + TestValute.convertiInEuro(valDollaro );
        System.out.println( "€: "+ totEuro );
        
        float totDollaro = valDollaro + TestValute.convertiInDollari(valEuro );
        System.out.println( "$: "+ totDollaro);
    }
}
