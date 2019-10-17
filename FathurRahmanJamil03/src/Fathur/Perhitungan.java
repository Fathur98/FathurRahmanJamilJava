package Fathur;
public class Perhitungan {
    public static void main(String[] args) {

        // membuat objek bangun datar
        // BangunDatar mBangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi mPersegi = new Persegi();
        mPersegi.sisi = 2;
        //BangunDatar mPersegi = new Persegi();
        //((Persegi)mPersegi).sisi = 2;

        // memanggil method luas dan keliling
        mPersegi.luas();
        mPersegi.keliling();

        // membuat objek Lingkaran dan mengisi nilai properti
        // Lingkaran mLingkaran = new Lingkaran();
        // mLingkaran.r = 22;

        // membuat objek Segitiga dan mengisi nilai properti
        // Segitiga mSegitiga = new Segitiga();
        // mSegitiga.alas = 12;
        // mSegitiga.tinggi = 8;


        // memanggil method luas dan keliling
        // mBangunDatar.luas();
        // mBangunDatar.keliling();

        // memanggil method luas dan keliling
        // mLingkaran.luas();
        // mLingkaran.keliling();

        // memanggil method luas dan keliling
        // mSegitiga.luas();
        // mSegitiga.keliling();
    }
}
