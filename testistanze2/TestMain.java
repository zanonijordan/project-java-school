package mws_2018_039.testistanze2;

public class TestMain {
    public static void main(String[] args) {
        Studente s1 = new Studente();
        s1.nome = "Lele";
        
        Studente s2 = new Studente();
        s2.nome = "Manu";
        
        Studente.MAX_BOCCIATURE = 10;
        
        System.out.println("s1 - nome :"+ s1.nome);
        System.out.println("s1 - cogn :"+ s1.cognome);
    }
}
