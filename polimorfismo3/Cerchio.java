package mws_2018_039.polimorfismo3;

public class Cerchio implements Poligono{
    public int raggio;

    @Override
    public float dammiArea() {
        return raggio * raggio * 3.14F;
    }
    
}
