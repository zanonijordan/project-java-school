package mws_2018_039.testfiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("/Users/er/Google Drive/DOCUMENTI/MWS/MW2018-039/CH_01/file_in.txt" );
            outputStream = new FileWriter("/Users/er/Google Drive/DOCUMENTI/MWS/MW2018-039/CH_01/file_out.txt" );

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}