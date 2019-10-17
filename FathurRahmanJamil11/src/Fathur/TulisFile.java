package Fathur;

import java.io.*;

public class TulisFile {
    public void menulisFile(String data, Boolean append){
        File file = new File("D:"+File.separator+"data_output.txt");

        try {

            FileWriter menulisFile = new FileWriter(file,append);
            BufferedWriter membuatFile = new BufferedWriter(menulisFile);
            membuatFile.write(data);
            membuatFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}