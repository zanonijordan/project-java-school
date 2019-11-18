package mws_2018_039.array;

import mws_2018_039.testprimitive.Animali;

public class TestArray3 {
    public static void main(String[] args) {
        Animali fattoria[] = new Animali[4];
        
        Animali a1 = new Animali();
        Animali a2 = new Animali();
        Animali a3 = new Animali();
        Animali a4 = new Animali();
        
        a1.nome = "micio";
        a2.nome = "fido";
        a3.nome = "pluto";
        a4.nome = "pappo";
        
        fattoria[0] = a1;
        fattoria[1] = a2;
        fattoria[2] = a3;
        fattoria[3] = a4;
        
        for( int i=0; i<fattoria.length; i = i+1 ){
            System.out.println("- "+ fattoria[i]);
            
            if( fattoria[i].equals( a2 ) ) {
                System.out.println("trovato a2 (fido) !!!!");
            }
            
        }
    }
}
