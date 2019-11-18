package mws_2018_039.testcostruttore2;

public class StampanteFinta extends Device{

    
    public void stampa( String str ){
        System.out.println("Stampo:\n"+ str);
    }
    
    private boolean cartaOk(){
        return true;
    }
    
    private boolean tonerOk(){
        return true;
    }
}
