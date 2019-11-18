package mws_2018_039.testfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream( "/Users/er/Google Drive/DOCUMENTI/MWS/MW2018-039/CH_01/file_in.jpg" );
            out = new FileOutputStream("/Users/er/Google Drive/DOCUMENTI/MWS/MW2018-039/CH_01/file_out.jpg");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch(Exception e) {
            System.out.println("errore: "+ e);
        } finally {
            if (in != null) {
                System.out.println("close in");
                in.close();
            }
            if (out != null) {
                System.out.println("close out");
                out.close();
            }
        }
    }
}