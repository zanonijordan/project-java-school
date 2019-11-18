package mws_2018_039.testcostruttore;

public class Veicolo {
    private String matricola;
    private String proprietario;

    public Veicolo(String matricola, String proprietario) {
        System.out.println("istanzio Veicolo");
        this.matricola = matricola;
        this.proprietario = proprietario;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    
}
