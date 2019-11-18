package mws_2018_039.polimorfismo3;

public class Triangolo implements Poligono{
    public int base;
    public int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float dammiArea() {
        return base * altezza / 2;
    }
    
    
}
