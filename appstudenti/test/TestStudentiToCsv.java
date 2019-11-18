package mws_2018_039.appstudenti.test;

import java.util.ArrayList;
import mws_2018_039.appstudenti.dto.StudenteDTO;

public class TestStudentiToCsv {
    public static void main(String[] args) {
        StudenteDTO s = new StudenteDTO();
        s.setCognome(   "Rizzo");
        s.setNome(      "Lele");
        s.setEta(       19);
        s.setMatricola( "A001");
        
        //System.out.println(studenteToCsv(s));
        
        ArrayList<StudenteDTO> a = new ArrayList<>();
        a.add(s);
        a.add(s);
        a.add(s);

        System.out.println(studentiToCsv(a));
        
        s.setMatricola(null);
        System.out.println(studentiToCsv(a));
    }
    
    private static String studenteToCsv( StudenteDTO s ){
        String csv = "";
        String cognome = s.getCognome();
        String nome = s.getNome();
        Integer eta = s.getEta();
        String matricola = s.getMatricola();
        String etastr = "";
        
        if (cognome==null) cognome="";
        if (nome==null) nome="";
        if (eta!=null) etastr = ""+eta;
        if (matricola==null) matricola="";
        
        csv = cognome + ";" + nome + ";" + etastr + ";" + matricola;
        
        return csv;
    }
    
    private static String studentiToCsv(ArrayList<StudenteDTO> sd){
        String csv = "";
        
        for (StudenteDTO s : sd) {
            csv += studenteToCsv(s) + "\n";            
        }
        
        return csv;
    }
}
