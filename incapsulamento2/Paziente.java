package mws_2018_039.incapsulamento2;

public class Paziente {
    private String nome;
    private String cognome;
    private int eta;
    private String patologia;
    private int giorniRicovero;
    private boolean guarito;
    
    
    
    public void metodoEsempio( String nome ){
        System.out.println("var: "+ this.nome);
    }
    
    public void setGiorniRicovero( int giorniRicovero ){
        this.giorniRicovero = giorniRicovero;
    }
    public int getGiorniRicovero(){
        return giorniRicovero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public boolean isGuarito() {
        return guarito;
    }

    public void setGuarito(boolean guarito) {
        this.guarito = guarito;
    }
    
    
}
