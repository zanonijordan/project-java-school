package mws_2018_039.testereditarieta;

public class TestMain {
    public static void main(String[] args) {
        Automobile a = new Automobile();
        Barca b = new Barca();
        Veicolo v = new Veicolo();
        
        Motorizzazione mt = new Motorizzazione();
        mt.immatricola( a, "AA001" );
        mt.immatricola( b, "AA002" );
        mt.immatricola( v, "AA00"  );

    }
}
