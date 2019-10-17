package Fathur;
//package AppBotcamp;
public class KotakPensil extends Perdagangan{
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
        System.out.println("Pendapatan Kotak Pensil                     : " + pendapatan);
        return pendapatan;
    }

    public int modal(){
        int modal = stok * hargabeli;
        System.out.println("Modal Kotak Pensil                          : " + modal);
        return modal;
    }

    public int selisih(int modal,int pendapatan){
        if (modal > pendapatan){
            int selisih = modal - pendapatan;
            System.out.println("Selisih Modal dan Pendapatan Kotak Pensil   : " + selisih);
            return selisih;
        }else{
            int selisih = pendapatan - modal;
            System.out.println("Selisih Modal dan Pendapatan Kotak Pensil   : " + selisih);
            return selisih;
        }
    }

    public int indikator(int modal,int pendapatan){
        if (modal > pendapatan){
            System.out.println("Penjualan Kotak Pensil Reza 'UNTUNG' hanya saja 'TIDAK HABIS' dalam kurun waktu 1 bulan");
            return 0;
        }else{
            System.out.println("Penjualan Kotak Pensil Reza 'UNTUNG' dan 'HABIS' dalam kurun waktu satu bulan");
            return 0;
        }
    }
}