package Latihan1;

import java.io.*;
import java.util.Scanner;

public class Aplikasi {
    public static void main(String[] args) {
        Aplikasi latihan = new Aplikasi();
        latihan.cekFolder();
    }

    private void cekFolder(){
        //BACA FOLDER
        readFileOnFolder();
        System.out.println("PILIH FILE YANG AKAN DILIHAT");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //BACA FILE
        readFileScanner(input);

        System.out.println("ADA DATA YANG MAU DITAMBAH? Y/N");
        String edit = scanner.nextLine();
        if (edit.equals("Y")){
            terakhir(input);
        } else {
            System.exit(0);
        }
    }

    private void readFileOnFolder(){
        File dir = new File("D:"+File.separator+"Latihan1");
        dir.isDirectory();
        File[] listFile = dir.listFiles();
        for(File filex : listFile){
            System.out.println(filex.getName());
        }
    }

    private void readFileScanner(String baru){
        File file = new File("D:"+File.separator+"Latihan1"+File.separator+baru);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("FILE TIDAK DITEMUKAN");
        }
    }

    private void editFile(String baru1, String baru3){
        String content = baru1;
        String fileName = "D:"+File.separator+"Latihan1"+File.separator+baru3;
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
            System.out.println("PENAMBAHAN BERHASIL");
            readFileScanner(baru3);
        } catch (IOException e) {
            System.out.println("PENAMBAHAN TIDAK BERHASIL");
        }
    }

    private void terakhir(String input){
        Scanner scanner = new Scanner(System.in);

        System.out.println("MASUKKAN NAMA :");
        String nama = scanner.nextLine();
        System.out.println("MASUKKAN KELAS :");
        String kelas = scanner.nextLine();

        String masukan = nama+"  | "+kelas;
        editFile(masukan,input);
    }
}