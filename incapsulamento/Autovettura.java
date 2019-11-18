package mws_2018_039.incapsulamento;

public class Autovettura {
    private int cilindrata;
    private String marca = "AUDI";
    public String modello;
    
    public void setCilindrata( int c ){
        cilindrata = c;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    
    public String getMarca(){
        return marca;
    }
}
