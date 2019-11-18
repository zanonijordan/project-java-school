package mws_2018_039.polimorfismo3;

public class TestPoligoni {
    public static void main(String[] args) {
        Triangolo  t  = new Triangolo(5,9);
        
        Cerchio    c1 = new Cerchio();
        c1.raggio = 7;
        
        Quadrato q = new Quadrato();
        q.lato = 12.3F;
        
        Rettangolo r  = new Rettangolo();
        r.a = 8;
        r.b = 7;

        GestionePoligoni gp = new GestionePoligoni();
        gp.p1 = t;
        gp.p2 = c1;
        gp.p3 = q;
        gp.p4 = r;
        
        gp.stampaAreaTotale();
    }
}
