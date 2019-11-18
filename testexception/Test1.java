package mws_2018_039.testexception;
 

public class Test1 {
    public static void main(String[] args) {
        System.out.println("INIZIO");
        
        
        try { 
            inviaSoldi(34, "lele");
        } catch (NumeroSbagliatoException ex) {
            System.out.println("ERRORE cifra non valida");
        } catch (DestinatarioSbagliatoException ex) {
            System.out.println("ERRORE nome non valido");
        }
        
        System.out.println("FINE");
    }
    
    private static void inviaSoldi( int s, String dst ) throws NumeroSbagliatoException, DestinatarioSbagliatoException{
        
        if( s<=0 ) throw new NumeroSbagliatoException();
        
        if( dst.length()<1 ) throw new DestinatarioSbagliatoException();
        
        System.out.println("invio "+ s +" € a "+ dst);
    }
    
    
}
