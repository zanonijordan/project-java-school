package mws_2018_039.appstudenti.storage;

import java.io.IOException;
import java.util.ArrayList;
import mws_2018_039.appstudenti.dto.StudenteDTO;
import mws_2018_039.appstudenti.util.FileUtil;
import mws_2018_039.appstudenti.util.StringUtil;

public class StudentiStorageFile implements IStudentiStorage{
    public static final String CSV_STUDENTI = "/Users/er/Google Drive/DOCUMENTI/MWS/MW2018-039/studenti.csv";

    @Override
    public void registraStudenti(ArrayList<StudenteDTO> l) {
        String csv = studentiToCsv( l );
        try {
            //System.out.println("CSV:\n"+ csv);
            FileUtil.registraStringSuFile( CSV_STUDENTI, csv );
        } catch (IOException ex) {
            System.out.println("Impossibile scrivere file: " + ex);
        }
    }
    

    /**
     * Serve per caricare gli studenti all'avvio.
     * Non utilizzarlo ...
     * @return ArrayList<StudenteDTO> - elenco degli studenti caricati dal file studenti.csv
     */
    @Override
    public ArrayList<StudenteDTO> caricaElencoStudenti() {
        String csv;
        try {
            csv = FileUtil.caricaStringDaFile( CSV_STUDENTI );
        } catch (IOException ex) {
            System.out.println("errore di lettura studenti:"+ ex);
            csv = "";
        }
        return csvToStudenti( csv );
    }
    
    
    private String studenteToCsv( StudenteDTO s ){
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
    
    private String studentiToCsv(ArrayList<StudenteDTO> sd){
        String csv = "";
        
        for (StudenteDTO s : sd) {
            csv += studenteToCsv(s) + "\n";            
        }
        
        return csv;
    }

    private ArrayList<StudenteDTO> csvToStudenti(String csv) {
        ArrayList<StudenteDTO> retList = new ArrayList<>();
        ArrayList<String> l = StringUtil.splitBy( csv, "\n" );
        StudenteDTO currS;
        for(String currRow : l){
            currS = csvToStudente( currRow );
            if(currS!=null) retList.add( currS );
            else System.out.println("RIGA NON VALIDA: "+ currRow);
        }
        
        return retList;
    }
    private StudenteDTO csvToStudente(String currRow) {
        ArrayList<String> col = StringUtil.splitBy(currRow, ";");
        if( col==null || col.size()<4 ) return null;
        StudenteDTO s = new StudenteDTO();
        s.setCognome(   col.get(0));
        s.setNome(      col.get(1));
        
        String eta = col.get(2);
        if(eta!=null && !eta.equals("")){
            s.setEta(   new Integer( eta ));
        }
        s.setMatricola( col.get(3));
        
        return s;
    }

    @Override
    public void registraStudente(StudenteDTO s) {
        System.out.println("NON SUPPORTATO");
    }

}
