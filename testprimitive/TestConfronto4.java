package mws_2018_039.testprimitive;

public class TestConfronto4 {
    public static void main(String[] args) {
        Integer i1 = new Integer(3);
        Integer i2 = new Integer(3);
        
        confronta(i1, i2);
        
        String s1 = "ciao";
        String s2 = "miao";
        confronta(s1, s2);
        
        Scrivania sc1 = new Scrivania();
        Scrivania sc2 = new Scrivania();
        confronta(sc1, sc2);
    }
    
    public static void confronta( Comparable c1, Comparable c2 ){
        System.out.println("--> " + c1.compareTo(c2));
    }
}
