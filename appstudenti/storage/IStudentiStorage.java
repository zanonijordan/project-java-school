package mws_2018_039.appstudenti.storage;

import java.util.ArrayList;
import mws_2018_039.appstudenti.dto.StudenteDTO;

public interface IStudentiStorage {
    public void registraStudenti( ArrayList<StudenteDTO> l );
    public ArrayList<StudenteDTO> caricaElencoStudenti();
    public void registraStudente( StudenteDTO s );
}
