package mws_2018_039.polimorfismo3;

public class Quadrato implements Poligono{
    public float lato;

    @Override
    public float dammiArea() {
       return lato * lato;
    }
    
    public void stampaLunghezzaLato(){
        System.out.println("Lato: "+ lato +" cm");
    }
    
}
