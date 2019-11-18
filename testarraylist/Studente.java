package mws_2018_039.testarraylist;

public class Studente {
    private String nome;
    private String cognome;
    private String cf;

    public Studente(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    @Override
    public boolean equals(Object obj) {
        Studente other = (Studente)obj;
        if(        this.getNome().equalsIgnoreCase(    other.getNome() )
                && this.getCognome().equalsIgnoreCase( other.getCognome() ))
            return true;
        
        return false;
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

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
    
    
    
}
