package mws_2018_039.polimorfismo4;

public class TestStampante {
    public static void main(String[] args) {
        Fattura f = new Fattura();
        Offerta o = new Offerta();
        DDT     d = new DDT();
        CartaDiIdentita ci = new CartaDiIdentita();
        
        Stampante sp = new Stampante();
        sp.stampaDoc( f );
        sp.stampaDoc( o );
        sp.stampaDoc( d );
        sp.stampaDoc( ci );
    }
}
