package mws_2018_039.polimorfismo2;

public class TestMain {
    public static void main(String[] args) {
        Impiegato  i = new Impiegato();
        Segretario s = new Segretario();
        Consulente c = new Consulente();
        Schiavetto x = new Schiavetto();
        
        DatoreDiLavoro dl = new DatoreDiLavoro();
        dl.lavoraStandard( i );
        dl.lavoraStandard( s );
        dl.lavoraStraordinario( c );
        
        dl.lavoraStandard( x );
        dl.lavoraStraordinario( x );
    }
}
