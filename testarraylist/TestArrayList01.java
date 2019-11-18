package mws_2018_039.testarraylist;

public class TestArrayList01 {
    static String e[] = new String[5];
    
    public static void main(String[] args) {
        aggiungi(0, "Lele");
        aggiungi(3, "Ema");
        
        for(int i=0; i<e.length; i++){
            System.out.println("- "+ e[i]);
        }
        
        
    }
    
    public static void aggiungi(int pos, String val){
        e[pos] = val;
    }
}
