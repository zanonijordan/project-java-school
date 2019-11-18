package mws_2018_039.testcostruttore;

public class TestVeicoli {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("Diesel", 120, "AZ6665500111", "Lele");
        
        System.out.println("prop: "+a1.getProprietario());
        
    }
}
