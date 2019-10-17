package Fathur;
public class BukuTulis extends Perdagangan{
    public int hargabeli;
    public int hargajual;
    public int stok;
    public int terjual;
    public int pendapatan;
    public int modal;
    public int selisih;
    public int indikator;

    public int pendapatan(){
        int pendapatan = terjual * hargajual;
        System.out.println("Pendapatan Buku Tulis                       : " + pendapatan);
        return pendapatan;
    }

    public int modal(){
        int modal = stok * hargabeli;
        System.out.println("Modal Buku Tulis                            : " + modal);
        return modal;
    }

    public int selisih(int modal,int pendapatan){
        if (modal > pendapatan){
            int selisih = modal - pendapatan;
            System.out.println("Selisih Modal dan Pendapatan Buku Tulis     : " + selisih);
            return selisih;
        }else{
            int selisih = pendapatan - modal;
            System.out.println("Selisih Modal dan Pendapatan Buku Tulis     : " + selisih);
            return selisih;
        }
    }

    public int indikator(int modal,int pendapatan){
        if (modal > pendapatan){
            System.out.println("Penjualan Buku Tulis Reza 'UNTUNG' hanya saja 'TIDAK HABIS' dalam kurun waktu 1 bulan");
            return 0;
        }else{
            System.out.println("Penjualan Buku Tulis Reza 'UNTUNG' dan 'HABIS' dalam kurun waktu sebulan");
            return 0;
        }
    }
}