package mws_2018_039.polimorfismo2;

public class DatoreDiLavoro {
    public void lavoraStandard( LavoratoreStandard l ){
        l.lavoraLun();
        l.lavoraMar();
        l.lavoraVen();
    }
    
    public void lavoraStraordinario( LavoratoreFestivo l ){
        l.lavoraSab();
        l.lavoraDom();
    }
}
