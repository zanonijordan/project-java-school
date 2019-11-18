package mws_2018_039.polimorfismo;

public class Batteria implements IStrumentoMusicale {

    @Override
    public void suona() {
        System.out.println(".... suona");   
    }

    @Override
    public int dammiPrezzo(String nomeStrumento) {
        return 0;
    }
    
}
