package mws_2018_039.testprimitive;

public class TestConfronto {
    public static void main(String[] args) {
        
       Scrivania s1 = new Scrivania();
       s1.codice = 33;
       Scrivania s2 = new Scrivania();
       s2.codice = 33;
       
       System.out.println(" uguali: "+ s1.equals(s2));
        
    }
}
