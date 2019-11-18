package mws_2018_039.testprimitive;

public class Animali {
    public String nome;
    public String cognome;
    public Integer eta;
   
    @Override
    public boolean equals( Object o ){
        Animali a = (Animali)o;
        
        return a.nome.equals( this.nome );
    }

    @Override
    public String toString() {
        return this.nome +" "+ this.cognome;
    }
    
    
}
