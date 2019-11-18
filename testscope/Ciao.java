package mws_2018_039.testscope;

public class Ciao {
    public String nome;
    public String cognome;
    
    public void stampaNome(){
        System.out.println(this.nome);
    }
    
    public void stampa2(String nome){
        this.nome = nome;
        System.out.println(this.nome);
    }
}
