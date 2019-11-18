
package mws_2018_039.polimorfismo;

public class TestPolimorfismo {
    public static void main(String[] args) {
        IStrumentoMusicale b = new Batteria();
        IStrumentoMusicale f = new Flauto();
        
        SuonatoreConInterfaccia s = new SuonatoreConInterfaccia();
        s.suonaStrumento( b );
        s.suonaStrumento( f );
    }
}
