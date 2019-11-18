package mws_2018_039.testanonymousinnerclass;

public class TestAIC {
    public static void main(String[] args) {
        
        /*  CLASSE NORMALE */
        Stampante s1 = new MiaStampante();
        s1.stampa("Lele");
        
        /*  ANONYMOUS INNER CLASS */
        Stampante s = new Stampante() {
            @Override
            public void stampa(String txt) {
                System.out.println("<><><> "+ txt);
            }
        };
        
        s.stampa("Lele");
    }
}
