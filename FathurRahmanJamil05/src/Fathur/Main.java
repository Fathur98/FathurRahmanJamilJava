package Fathur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        JavaDeveloper java1 = new JavaDeveloper("Reza", 4000000);
        JavaDeveloper java2 = new JavaDeveloper("Mirna", 6000000);
        JavaDeveloper java3 = new JavaDeveloper("Lisna", 3500000);
        JavaDeveloper java4 = new JavaDeveloper("Nita", 5000000);
        JavaDeveloper java5 = new JavaDeveloper("Risma", 12000000);
        JavaDeveloper java6 = new JavaDeveloper("Niki", 8000000);
        JavaDeveloper java7 = new JavaDeveloper("Vinni", 2500000);

        List<Karyawan> karyawanList = new ArrayList<>();
        karyawanList.addAll(Arrays.asList(java1,java2,java3,java4,java5,java6,java7));

        for(int i=1;i<=6;i++){
            Karyawan karyawan = karyawanList.get(i);
            karyawan.getGaji();
            karyawan.getNama();

            if (karyawan.getGaji()<=3500000){
                Integer potongan =0;
                Integer gajibersih = karyawan.getGaji();

                System.out.println(" ");
                System.out.println("KARYAWAN DEVELOPER");
                System.out.println("NAMA KARYAWAN   : "+karyawan.getNama());
                System.out.println("GAJI KOTOR      : "+karyawan.getGaji());
                System.out.println("GAJI BERSIH     : "+gajibersih);
                System.out.println("POTONGAN        : "+potongan);

            }else if (karyawan.getGaji()<=5000000|karyawan.getGaji()>3500000){
                Integer potongan =((5 * karyawan.getGaji())/100);
                Integer gajibersih = karyawan.getGaji() - potongan;

                System.out.println(" ");
                System.out.println("KARYAWAN DEVELOPER");
                System.out.println("NAMA KARYAWAN   : "+karyawan.getNama());
                System.out.println("GAJI KOTOR      : "+karyawan.getGaji());
                System.out.println("GAJI BERSIH     : "+gajibersih);
                System.out.println("POTONGAN        : "+potongan);

            }else if (karyawan.getGaji()<=10000000|karyawan.getGaji()>5000000){
                Integer potongan =((10 * karyawan.getGaji())/100);
                Integer gajibersih = karyawan.getGaji - potongan;

                System.out.println(" ");
                System.out.println("KARYAWAN DEVELOPER");
                System.out.println("NAMA KARYAWAN   : "+karyawan.getNama());
                System.out.println("GAJI KOTOR      : "+karyawan.getGaji());
                System.out.println("GAJI BERSIH     : "+gajibersih);
                System.out.println("POTONGAN        : "+potongan);
            }

        }
    }
}
