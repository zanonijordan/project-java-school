package mws_2018_039.testprimitive;

public class TestEquals {
    public static void main(String[] args) {
        int i1 = 4;
        int i2 = 4;
        Scrivania s1 = new Scrivania();
        Scrivania s2 = new Scrivania();
        Scrivania s3 = s1;
        boolean seUguali = (s1.equals(s2));
        System.out.println("sono uguali? ... "+ seUguali);
    }
}
