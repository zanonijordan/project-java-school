package mws_2018_039.testwhile;

public class TestMain {
    public static void main(String[] args) {
        String elenco[] = {"lele", "ema", "manu", "manué", "emanuele"};
        
        for (int i = 0; i < elenco.length; i++) {
            String nome = elenco[i];
            System.out.println("- "+ nome);
            if( nome.equals("ema") ) continue;
            System.out.println("   ...");
        }
        System.out.println("STOP");
        
    }
}
