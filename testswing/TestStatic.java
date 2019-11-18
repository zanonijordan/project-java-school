package mws_2018_039.testswing;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("ciao.....");
        
        class Lele{
            public void faiUqlcosa(){
                System.out.println("qualcosa");
            }
        }
        Lele l = new Lele();
    }
    
    
    
    private static void ciao(){
        
        class Lele{
            public void faiUqlcosa(){
                System.out.println("qualcosa");
            }
        }
        Lele l = new Lele();
    }
    
}
