package Fathur;

public class Main {
    public static void main(String[] args) {
        System.out.println("|=====================================================================================|");
        System.out.println("|                           PROGRAM PENJUALAN BARANG                                  |");
        System.out.println("|=====================================================================================|");
        System.out.println("|No| BARANG        |  Harga Beli         |  Harga Jual      |  Stok       |  Terjual  |");
        System.out.println("|=====================================================================================|");
        System.out.println("|1 | Buku Tulis    |  Rp.25000/Pak(12)   |  Rp.3000/Buku    |  25 Pak     | 112 Biji  |");
        System.out.println("|2 | Pensil        |  Rp.26000/Kotak(12) |  Rp.2000/Pensil  |  20 kotak   | 100 Biji  |");
        System.out.println("|3 | Kotak Pensil  |  Rp.65000           |  Rp.75000        |  20 Buah    | 15  Biji  |");
        System.out.println("|=====================================================================================|");


        BukuTulis bukutulis = new BukuTulis();
        bukutulis.hargabeli = 25000;
        bukutulis.hargajual = 3000;
        bukutulis.stok = 25;
        bukutulis.terjual = 112;

        Pensil pensil = new Pensil();
        pensil.hargabeli = 26000;
        pensil.hargajual = 2000;
        pensil.stok = 20;
        pensil.terjual = 100;

        KotakPensil kotakpensil = new KotakPensil();
        kotakpensil.hargabeli = 65000;
        kotakpensil.hargajual = 75000;
        kotakpensil.stok = 20;
        kotakpensil.terjual = 15;


        System.out.println("    ");
        System.out.println("Laporan Penjualan Buku Tulis Reza di bulan tersebut");
        int pendapatan1 = 0;
        pendapatan1 = bukutulis.pendapatan();
        int modal1 = 0;
        modal1 = bukutulis.modal();
        bukutulis.selisih(modal1,pendapatan1);
        bukutulis.indikator(modal1,pendapatan1);

        System.out.println("    ");
        System.out.println("Laporan Penjualan Pensil Reza di bulan tersebut");
        int pendapatan2 = 0;
        pendapatan2 = pensil.pendapatan();
        int modal2 = 0;
        modal2 = pensil.modal();
        pensil.selisih(modal2,pendapatan2);
        pensil.indikator(modal2,pendapatan2);


        System.out.println("    ");
        System.out.println("Laporan Penjualan Kotak Pensil Reza di bulan tersebut");
        int pendapatan3 = 0;
        pendapatan3 = kotakpensil.pendapatan();
        int modal3 = 0;
        modal3 = kotakpensil.modal();
        kotakpensil.selisih(modal3,pendapatan3);
        kotakpensil.indikator(modal3,pendapatan3);
    }
}