package mws_2018_039.testhelloworld;

public class Immobile {
    public static int MAX_PIANO = 30;
    
    private String citta;
    private String via;
    private String civico;
    private int piano;
    
    
    
    public String dammiDescrizione(){
        String val;
        val = getCitta() +" - "+ getVia() +", "+ getCivico() +" piano: "+ getPiano();    
        return val;
    }
    
    public void stampaDescrizione(){
        String val = getCitta() +" - "+ getVia() +", "+ getCivico() +" pino: "+ getPiano();
        System.out.println("--> "+ val);
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }
}
