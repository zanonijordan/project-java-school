package mws_2018_039.testhelloworld;

public class TestMain {
    public static void main(String[] args) {
        Immobile i1 = new Immobile();
        i1.setCitta(  "Roma");
        i1.setVia(    "Via Italia");
        i1.setCivico( "12/C");
        i1.setPiano(  6);
        i1.stampaDescrizione();
        
        Immobile i2 = new Immobile();
        i2.setCitta( "Catania");
        i2.setVia(   "Via Torino");
        i2.setCivico("19");
        i2.setPiano(  8);
        i2.stampaDescrizione();
        
        String d = i2.dammiDescrizione();
        System.out.println("==> "+ Immobile.MAX_PIANO);
    }
}
