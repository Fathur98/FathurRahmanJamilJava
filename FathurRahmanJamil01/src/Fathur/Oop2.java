package Fathur;

public class Oop2 {

        // definisi atribut
        String nama;
        int umur;

        // definisi method run
        void run(){
            System.out.println("Nama : "+nama);
            System.out.println("Umur : "+umur);
        }

        // definisi method isDead untuk mengecek nilai kesiapan
        boolean kesiapan(){
            if(umur <= 50) return true;
            return false;
        }
}
