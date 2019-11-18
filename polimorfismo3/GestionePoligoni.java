package mws_2018_039.polimorfismo3;

public class GestionePoligoni {
    public Poligono p1;
    public Poligono p2;
    public Poligono p3;
    public Poligono p4;
    
    public void stampaAreaTotale(){
        float a = p1.dammiArea();
        a = a + p2.dammiArea();
        a = a + p3.dammiArea();
        a = a + p4.dammiArea();
        System.out.println("Area totale: "+ a);
    }
}
