package mws_2018_039.array;

public class TestArray4 {
    public static void main(String[] args) {
        int[][] a = new int[6][];
        
        int[] a0 = {1,2,3};
        int[] a1 = {11,12,13};
        int[] a2 = {21,22,23,23,23,2323,223};
        int[] a3 = {31,32,33,56,34,123,435};
        int[] a4 = {41,42,43};
        int[] a5 = {51,52,53};
        
        a[0] = a0;
        a[1] = a1;
        a[2] = a2;
        a[3] = a3;
        a[4] = a4;
        a[5] = a5;
        
        int[][] intArray = dammiMatrice(10,10);
        //stampaValori(intArray);
    }
    
    private static void stampaValori( int[] val ){
        for (int i=0; i<val.length; i=i+1){
            System.out.print("\n"+val[i] + " ");
        }
    }
    
    private static void stampaValori( int[][] val ){
        for (int i=0; i<val.length; i=i+1){
            System.out.print("\n");
            for (int j=0; j<val[i].length; j=j+1) {
                System.out.print(val[i][j] + " ");
            }
        }
    }
    
    private static int[][] dammiMatrice(int x, int y){
        int[][] m = new int[x][y];
        for(int i=0; i<x; i++){
            System.out.print("\n");
            for(int j=0; j<y; j++){
               m[i][j] = (i+1)*(j+1);
               System.out.print(""+(i+1)+"x"+(j+1)+"= "+ m[i][j] +" ;");
            }
        }
        return m;
    }
    
    private static int[] dammiMatrice(){
        int[] m = new int[10];
        for(int i=0; i<m.length; i++){
            m[i] = (i+1)*3;
        }
        return m;
    }
}
