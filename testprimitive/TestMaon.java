package mws_2018_039.testprimitive;

public class TestMaon {
    public static void main(String[] args) {
        byte b1  = 44;
        byte b2  = 44;
        
        Byte wb = new Byte( b1 );
        
        short s = 233;
        Short ws = new Short( s );
        
        int i   = 23423423;
        Integer wi = new Integer(i);
        
        long a = 31235645233432324L;
        Long wa = new Long( a );
        
        float f  = 3334.1234F;
        Float wf = new Float(f);
        
        double d = 12341.123412312342D;
        Double wd = new Double( d );
        
        boolean loFaccio  = false;
        Boolean loFaccio2 = new Boolean( loFaccio );
        
        char c = 'e';
        char c1 = '\u0077';
        Character wc = new Character(c1);
        
        System.out.println("--->"+ c1);
    }
}
