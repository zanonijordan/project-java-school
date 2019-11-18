package mws_2018_039.appstudenti.reader;

import java.util.Scanner;
import mws_2018_039.appstudenti.dto.StudenteDTO;

public class StudentiReaderScanner extends Reader implements IStudentiReader {
    
    @Override
    public StudenteDTO read(){
        StudenteDTO s = new StudenteDTO();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cognome: ");
        String cognome = sc.next();
        s.setCognome(cognome);
        
        System.out.print("Nome: ");
        String nome = sc.next();
        s.setNome(nome);
        
        System.out.print("Matricola: ");
        String mat = sc.next();
        s.setMatricola(mat);
        
        int eta = leggiInt(18, 60, "Età");
        s.setEta( eta );
        
        return s;
    }
    
}
