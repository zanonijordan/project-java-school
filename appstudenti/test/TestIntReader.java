package mws_2018_039.appstudenti.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mws_2018_039.appstudenti.reader.Reader;
import mws_2018_039.appstudenti.util.FileUtil;

public class TestIntReader {
    public static void main(String[] args) {
        Reader r = new Reader();
        
        int val = r.leggiInt(18, 60, "Età");
        System.out.println("eta: "+ val);
    }
}
