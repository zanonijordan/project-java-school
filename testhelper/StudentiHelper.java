package mws_2018_039.testhelper;

import java.util.ArrayList;
import mws_2018_039.appstudenti.dto.StudenteDTO;

public class StudentiHelper {
    private static final StudentiHelper INSTANCE = new StudentiHelper();
    
    private StudentiHelper() {
    }
    
    public static StudentiHelper getInstance() {
        return INSTANCE;
    }
    
    
    /* METHODS */
    public ArrayList<StudenteDTO> getElencoStudenti(){
        return null;
    }
    public StudenteDTO saveElencoStudente( StudenteDTO s ){
        return null;
    }
    public int deleteStudente( int id ){
        return 0;
    }
    
}
