package mws_2018_039.testpattern;

public class CiaoSingleton {
    private static CiaoSingleton INSTANCE = null;
    
    private CiaoSingleton() {
    }
    
    public static CiaoSingleton getInstance() {
        if( INSTANCE==null ) {
            System.out.println("Creo istanza");
            INSTANCE = new CiaoSingleton();
        } else {
            System.out.println("istanza già creata, uso esistente");
        }
        return INSTANCE;
    }
    
    public void faiQualcosa(){
        System.out.println("......");
    }
   
}
