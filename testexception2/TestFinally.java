package mws_2018_039.testexception2;

public class TestFinally {
    public static void main(String[] args) {
        try{
            dividi( 10 );
            return;
        } catch (Exception e){
            System.out.println("ERRORE:"+ e.getMessage());
            return;
        } finally {
            System.out.println("chudi il programma");
        }
        
    }
    
    private static void dividi(int i){
        System.out.println("100/i: "+ 100/i);
        
        return;
    }
}
