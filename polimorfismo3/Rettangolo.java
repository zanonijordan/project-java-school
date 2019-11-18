package mws_2018_039.polimorfismo3;

public class Rettangolo implements Poligono{
    public int a;
    public int b;
    
    @Override
    public float dammiArea(){
        return a * b;
    }
}
