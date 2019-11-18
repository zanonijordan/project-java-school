package mws_2018_039.testcostruttore;

public class Automobile extends Veicolo{
    private String tipoCarburante;
    private int cavalli;

    public Automobile(String tipoCarburante, int cavalli, String m, String p) {
        super(m,p);
        System.out.println("istanzio automobile");
        this.tipoCarburante = tipoCarburante;
        this.cavalli = cavalli;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }
    
    
    
}
