package mws_2018_039.testprimitive;

public class Scrivania implements Comparable<Scrivania>{
    public Integer codice;
    public String matricola;
    public Integer altezza;
    
    @Override
    public boolean equals( Object o ){
        Scrivania s = (Scrivania)o;
        
        boolean res = this.matricola.equals( s.matricola );
        
        return res ;
    }
    
    @Override
    public int compareTo( Scrivania other ){
        return this.altezza.compareTo( other.altezza );
    }
    
    public int compareToAllaLele(){
        return 44;
    }
}
