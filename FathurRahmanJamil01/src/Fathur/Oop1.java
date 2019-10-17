package Fathur;

public class Oop1 {
        public static void main(String[] args){

            // membuat objek player
            Oop2 petani = new Oop2();

            // mengisi atribut player
            petani.nama = "Otong Surotong";
            petani.umur = 35;

            // menjalankan method
            petani.run();

            if(petani.kesiapan()){
                System.out.println("Siap Macul!");
            }else{
                System.out.println("Tidak Siap Macul!");
            }

        }
}