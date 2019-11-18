package mws_2018_039.polimorfismo;

public class Flauto implements IStrumentoMusicale{

    @Override
    public void suona() {
        System.out.println(" soffio nel flauto magico");
    }

    @Override
    public int dammiPrezzo(String nomeStrumento) {
        return 4;
    }
    
}
