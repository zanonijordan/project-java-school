package mws_2018_039.testparametri;

public class TestMain {
    public static void main(String[] args){
        System.out.println("----- START -----");
        
        Studente.nome      = "Emanuele";
        Studente.cognome   = "Rizzo";
        Studente.matricola = "A123";
        Studente.eta       = 18;
        
        stampaNome( Studente.nome );
        System.out.println("----- STOP  -----");
    }
    
    public static void stampaNome( String n ){
        System.out.println("nome: "+ n);
    }
    public static void stampaStudente( Studente s ){
        
    }
}
