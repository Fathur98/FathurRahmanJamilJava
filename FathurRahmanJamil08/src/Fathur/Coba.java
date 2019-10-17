package Fathur;

public class Coba {

    public static void main(String[] args) {
        Coba pengulangan = new Coba();

        pengulangan.pengulangan();
        System.out.println();

        pengulangan.panggilParse1();
        System.out.println();

        pengulangan.panggilParse2();
        System.out.println();

        pengulangan.panggilHexa();
        System.out.println();
    }


    private void pengulangan() {
        long awal = 0;
        long batas = 10;
        double hasil = 1;

        if (awal == 0) {
            awal = 1;
        }

        if (batas > 170) {
            batas = 170;
        }

        for (long i = awal; i <= batas; i++) {
            hasil *= i;
            if (hasil<=0) {
                break;
            }else{
                //System.out.println("Perkalian ke "+i+" hasilnya "+hasil);
                System.out.print("Perkalian ke "+i+" ");
                System.out.printf("%.0f",hasil);
                System.out.println();
            }

        }
    }

    private void parseString(String data, String fieldName, int fromIdx, int toIdx){
        try {
            System.out.println(fieldName + " = [" + data.substring(fromIdx, toIdx).trim() + "]");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error :"+e.getMessage());
        }
    }

    private void panggilParse1(){
        String identitas = "0182000000003 1946340100147953 24012 0374 GPN2 190202 201 SISKA OKTARINI UTAMI    PONTIANAK";
        parseString(identitas,"Field 1",0,13);
        parseString(identitas,"Field 2", 14,30);
        parseString(identitas,"Field 3",31,36);
        parseString(identitas,"Field 4", 37,41);
        parseString(identitas,"Field 5", 42,46);
        parseString(identitas,"Field 6",47,53);
        parseString(identitas,"Field 7",54,57);
        parseString(identitas,"Field 8",58,81);
        parseString(identitas,"Field 9",82,91);
    }

    private void panggilParse2() {
        String text = "TEST";
        parseString(text, "Hasil",0, 4);
    }

    private int hexa(String nilai){
        nilai.toUpperCase();
        try {
            int temp1 = Integer.parseInt(nilai,16);
            System.out.println(temp1);
        } catch (NumberFormatException e) {
            System.out.println("Error :"+e.getMessage());
        }
        return 0;
    }

    private void panggilHexa(){
        String nilai ="ffff";
        System.out.print("Hasilnya hexanya = ");
        hexa(nilai);
    }
}