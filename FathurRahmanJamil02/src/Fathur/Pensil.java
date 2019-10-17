package Fathur;
public class Pensil extends Perdagangan {
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
        System.out.println("Pendapatan Pensil                           : " + pendapatan);
        return pendapatan;
    }

    public int modal(){
        int modal = stok * hargabeli;
        System.out.println("Modal Pensil                                : " + modal);
        return modal;
    }

    public int selisih(int modal,int pendapatan){
        if (modal > pendapatan){
            int selisih = modal - pendapatan;
            System.out.println("Selisih Modal dan Pendapatan Pensil         : " + selisih);
            return selisih;
        }else{
            int selisih = pendapatan - modal;
            System.out.println("Selisih Modal dan Pendapatan Pensil         : " + selisih);
            return selisih;
        }
    }

    public int indikator(int modal,int pendapatan){
        if (modal > pendapatan){
            System.out.println("Penjualan Pensil Reza 'RUGI'");
            return 0;
        }else{
            System.out.println("Penjualan Pensil Reza 'RUGI'");
            return 0;
        }
    }
}
