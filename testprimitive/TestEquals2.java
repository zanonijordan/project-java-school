package mws_2018_039.testprimitive;

public class TestEquals2 {
    public static void main(String[] args) {
        Animali a1 = new Animali();
        Animali a2 = new Animali();
        a1.nome = "lele";
        a1.cognome = "rizzo";
        
        a2.cognome = "rizzarelli";
        
        
        
        System.out.println("--> "+ a1);
        System.out.println("--> "+ a2);
        
        System.out.println("a1 == a2 "+ (a1==a2));
    }
}
