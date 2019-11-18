package mws_2018_039.appstudenti.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    public static String caricaStringDaFile(String fileName) throws IOException{
        String retVal = "";
        
        FileReader inputStream = null;
        try {
            inputStream = new FileReader( fileName );

            int c;
            while ((c = inputStream.read()) != -1) {
                retVal += (char)c;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        
        return retVal.trim();
    }
    
    public static void registraStringSuFile( String fileName, String str) throws IOException {
        FileWriter outputStream = null;

        try {
            outputStream = new FileWriter( fileName );

            outputStream.write(str.trim());
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
