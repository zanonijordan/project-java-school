package mws_2018_039.testistanze;

public class Persona {
    public static String genere = "UMANO";  // COSTANTE
    
    public String nome;     // ATTRIBUTO | VARIABILE
    public String cognome;  // ATTRIBUTO | VARIABILE
    public int eta;         // ATTRIBUTO | VARIABILE
    
    public void stampaNomeCompleto( String titolo ){    // titolo è un PARAMETRO
        System.out.println("sono il "+ titolo + " "+ nome);
    }
}
