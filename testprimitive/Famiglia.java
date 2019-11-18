package mws_2018_039.testprimitive;

public class Famiglia {
    public Scrivania s;
    public  Animali a;
    public String denominazione;
        
    /*
    @Override
    public boolean equals (Object obj) {
        boolean seUguali = this.s.equals(((Famiglia)obj).s) && 
                           this.a.equals(((Famiglia)obj).a) &&
                           this.denominazione.equals(((Famiglia)obj).denominazione);
        return seUguali;
    }
    */
    @Override
    public boolean equals (Object obj) {
        Famiglia other = (Famiglia)obj;
        
        boolean sUguale = this.s.equals(other.s);
        boolean aUguale = this.a.equals(other.a);
        boolean dUguale = this.denominazione.equals(other.denominazione);
        
        boolean seUguali =  sUguale && aUguale && dUguale;
        
        return seUguali;
    }
}
