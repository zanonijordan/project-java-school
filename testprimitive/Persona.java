package mws_2018_039.testprimitive;

public class Persona {
    public String nome;
    public String cognome;
    public String cf;

    @Override
    public boolean equals(Object obj) {
        Persona other = (Persona)obj;
        
        return this.cf.equals( other.cf )
            || ( this.nome.equals(other.nome) && this.cognome.equals(other.cognome) );
        
    }
    
    
}
