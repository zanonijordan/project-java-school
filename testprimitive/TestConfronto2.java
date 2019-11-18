package mws_2018_039.testprimitive;

public class TestConfronto2 {
    public static void main(String[] args) {
        //Integer i1 = new Integer(788);
        //Integer i2 = new Integer(99);
        String i1 = "CIAO";
        String i2 = "ciao";
        
        System.out.println("---> i1.compareto(i2): "+ ( i1.compareTo(i2) ));
        
        if( i1.compareTo(i2)<0 ){
            System.out.println("il numeo "+ i1 + " viene prima di "+ i2);
        }
        
        if( i1.compareTo(i2)>0 ){
            System.out.println("il numeo "+ i1 + " viene dopo di "+ i2);
        }
        
        if( i1.compareTo(i2)==0 ){
            System.out.println("il numeo "+ i1 + " viene insieme di "+ i2);
        }
    }
}
