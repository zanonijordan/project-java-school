package mws_2018_039.testereditarieta2;

public class StrumentoMusicale {
    protected String marca;
    protected String modello;
    protected String tipo;
    
    public void suona(){
        System.out.println(".... ta ta ta ...");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    
    
    
}

