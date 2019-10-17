package Fathur;
// read file

import java.io.*;
import java.util.*;

public class Coba {
    public static void main(String[] args) {
        System.out.println("File Anda");
        Coba coba = new Coba();

        // manggil yang scanner
        // coba.readFileScanner();

        // manggil yang buffer reader
        coba.readFileBufferReader();

        // manggil error throws
        // try {
        //     coba.error();
        // }catch (Exception e) {
        //     System.out.println("SALAH NGITUNG");
        //}
    }

    // dengan Scanner
    private void readFileScanner(){
        try {
            File file = new File("D:"+File.separator+"Data.txt");
            Scanner fileku = new Scanner(file);
            while (fileku.hasNextLine()) {
                String data = fileku.nextLine();
                System.out.println(data);
            }
            fileku.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // dengan Buffer Reader
    void readFileBufferReader(){
        File file = new File("D:"+File.separator+"Data.txt");
        try {
            BufferedReader fileku = new BufferedReader(new FileReader(file));
            String dataFile;
            while((dataFile = fileku.readLine())!=null){
                System.out.println(dataFile);
            }
            fileku.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Error ketika membaca file");
        }
    }

    // error throws exception
    private void error() throws Exception{
        int x = 15/0;
        System.out.println(x);
    }
}