package Fathur;
// read file

import java.io.*;
import java.util.*;

public class Cobaan1 {
    public static void main(String[] args) {
        System.out.println("DAFTAR MAHASISWA");
        Cobaan1 coba = new Cobaan1();
        coba.panggilReadFileBufferReader();
}

    private void panggilReadFileBufferReader() {
        File file = new File("D:"+File.separator+"Data.txt");

        ArrayList<Cobaan2> siswaKelas10 = new ArrayList<>();
        ArrayList<Cobaan2> siswaKelas11 = new ArrayList<>();
        ArrayList<Cobaan2> siswaKelas12 = new ArrayList<>();

        BufferedReader fileku = null;
        try {
            fileku = new BufferedReader(new FileReader(file));
            String dataFile="";
            while((dataFile = fileku.readLine()) != null){
                System.out.println(dataFile);

                String nama = dataFile.split("[|]")[0].trim();
                String kelas = dataFile.split("[|]")[1].trim();

                Cobaan2 siswa = new Cobaan2(nama,kelas);

                if (kelas.contains("10")){
                    siswaKelas10.add(siswa);
                }else if(kelas.contains("11")){
                    siswaKelas11.add(siswa);
                }else if(kelas.contains("12")){
                    siswaKelas12.add(siswa);
                }
            }

            System.out.println();
            System.out.println("Kelas 10 = "+siswaKelas10.size()+" Orang");
            int i = 0;
            int a = siswaKelas10.size();
            System.out.print("[");
            for (Cobaan2 siswa : siswaKelas10){
                System.out.print(siswa.getNama());
                if ( a-i >=3){
                    System.out.print(", ");
                }else if( a-i ==2){
                    System.out.print(" dan ");
                }else{
                    System.out.print("]");
                }
                i++;
            }

            System.out.println();
            System.out.println("Kelas 11 = "+siswaKelas11.size()+" Orang");
            int j = 0;
            int b = siswaKelas11.size();
            System.out.print("[");
            for (Cobaan2 siswa : siswaKelas11){
                System.out.print(siswa.getNama());
                if (b-j>=3){
                    System.out.print(", ");
                }else if(b-j==2){
                    System.out.print(" dan ");
                }else{
                    System.out.print("]");
                }
                j++;
            }

            System.out.println();
            System.out.println("Kelas 12 = "+siswaKelas12.size()+" Orang");
            int k = 0;
            int c = siswaKelas12.size();
            System.out.print("[");
            for (Cobaan2 siswa : siswaKelas12){
                System.out.print(siswa.getNama());
                if (c-k>=3){
                    System.out.print(", ");
                }else if(c-k==2) {
                    System.out.print(" dan ");
                }else{
                    System.out.print("]");
                }
                k++;
            }
            fileku.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Error ketika membaca file");
        }
    }
}