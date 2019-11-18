package mws_2018_039.arrayvsarraylist;

public class Test {
    public static void main(String[] args) {
        String elenco1[] = new String[4];
        String elenco2[] = {"ss","44","frfr"};
        Appartamento elenco3[] = new Appartamento[2];
        
        
        elenco1[0] = "Ciao";
        
        Appartamento a = new Appartamento();
        
        elenco3[1] = a;
        
        for( int i=0; i<elenco2.length; i++ ){
            System.out.println("- "+ elenco2[i]);
        }
        
        String ee[][] = new String[2][3];
        
        ee[0][0] = "ddd";
        ee[0][1] = "ddfff";
    }
}
