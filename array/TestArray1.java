package mws_2018_039.array;

import mws_2018_039.testprimitive.Persona;

public class TestArray1 {
    public static void main(String[] args) {
        int val = 4;
        Persona p = new Persona();
        p.nome = "Lele";
        
        String[] rubrica1 = new String[3];
        String rubrica2[] = new String[3];
        String[] rubrica3 = {"aaa", "d", null, "dd", "22"};
        rubrica3[2]= "ijijijij";
        
        System.out.println("-- "+ rubrica3[2]);
        System.out.println("num elem.: "+ rubrica3.length);
        
        
    }
}
