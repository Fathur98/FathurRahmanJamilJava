package Fathur;

import java.io.*;

public class Cobaan3 {
    public static void main(String[] args) {
        String fileName = "D:"+File.separator+"Fathur1.txt";
        String content ="\n Isi File \n";
        try {
            FileWriter writer = new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File dir = new File("D:");
        if(dir.isDirectory()){
            File[] listFile = dir.listFiles();
            for(File filex : listFile){
                System.out.println(filex.getName());
            }
        }
    }
}
