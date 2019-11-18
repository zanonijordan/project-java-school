package mws_2018_039.helloworld;

public class TestHello {
    private static String nome = "Lele";
    
    public static void main(String[] args){
        int result = MioPrint.inviaMail("lele@mws.net", "Test", "cioa cioa");
        System.out.println("ESITO: "+ result);
    }
    
}
