package mws_2018_039.array;

public class TestWhile1 {
    public static void main(String[] args) {
        String[] mioArray = dammiArray(20);
        
        for( int i=0; i<mioArray.length; i++ ){
            String currVal = mioArray[i];
            
            if( currVal.equals( "x_6" ) || currVal.equals( "x_15" ) ) {
                System.out.println("TROVATO!!!");
                continue;
            }
            System.out.println("ELABORO: "+ mioArray[i]);
        }
        
        System.out.println("fine");
            
    }
    
    private static String[] dammiArray( int l ){
        String[] m = new String[l];
        for(int i=0; i<m.length; i++){
            m[i] = "x_"+(i+1)*3;
        }
        return m;
    }
}
