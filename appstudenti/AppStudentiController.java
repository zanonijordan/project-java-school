package mws_2018_039.appstudenti;

import java.util.ArrayList;
import java.util.Scanner;
import mws_2018_039.appstudenti.dto.DocenteDTO;
import mws_2018_039.appstudenti.dto.StudenteDTO;
import mws_2018_039.appstudenti.reader.IStudentiReader;
import mws_2018_039.appstudenti.reader.StudentiReaderScanner;
import mws_2018_039.appstudenti.reader.StudentiReaderSwing;
import mws_2018_039.appstudenti.storage.StudentiStorageMySQLV2;

public class AppStudentiController {
    //private ArrayList<StudenteDTO> listaStudenti;
    private ArrayList<DocenteDTO>  listaDocenti;
    
    public void avviaPannello(){
        //IStudentiStorage sStorage = new StudentiStorageFile();
        //listaStudenti = StudentiStorageMySQLV2.getInstance().caricaElencoStudenti();
        listaDocenti  = new ArrayList<>();
        
        int scelta = 1;
        Scanner sc = new Scanner( System.in );
        while ( scelta>0 ) {
            mostraMenu();
            scelta = sc.nextInt();
            if(scelta==1) nuovoStudente();
            if(scelta==2) stampaStudenti();
            if(scelta==3) nuovoDocente();
            if(scelta==4) stampaDocenti();
            //if(scelta==5) registraElencoStudenti();
        }   
    }

    private void mostraMenu() {
        System.out.println("1: nuovo studente");
        System.out.println("2: lista studenti");
        System.out.println("3: nuovo docente");
        System.out.println("4: lista docenti");
        //System.out.println("5: resistra elenco studenti");
        System.out.println("0: esci");
    }

    private void stampaStudenti() {
        for( StudenteDTO s : StudentiStorageMySQLV2.getInstance().caricaElencoStudenti() ){
            System.out.println("- "+ s.getCognome() +" "+ s.getNome() +" "+ s.getEta());
        }
    }

    private void nuovoStudente() {
        //IStudentiReader reader = new StudentiReaderScanner();
        IStudentiReader reader = new StudentiReaderSwing();
        StudenteDTO s = reader.read();
        StudentiStorageMySQLV2.getInstance().registraStudente(s);
    }
    
    private void nuovoDocente(){
        System.out.println("DA FARE");
        //TODO - lo farete voi
    }
    
    private void stampaDocenti(){
        System.out.println("DA FARE");
        //TODO - lo farete voi
    }

    /*
    private void registraElencoStudenti() {
        //StudentiStorageFile sStorage = new StudentiStorageFile();
        IStudentiStorage sStorage = new StudentiStorageMySQL();
        sStorage.registraStudenti(listaStudenti);
    }
    */
    
}
