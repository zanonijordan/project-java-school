package mws_2018_039.testereditarieta2;


public class Chitarra extends StrumentoMusicale {
    public int numeroCorde;
    public String seElettrica;
    
    public void accorda( int numCorda ){
        System.out.println(" rda num: "+ numCorda + " dello strumento di marca "+ super.marca);   
    }
    
    @Override
    public void suona(){
        super.suona();
        System.out.println("stram stram stram");
        super.suona();
    }
}
