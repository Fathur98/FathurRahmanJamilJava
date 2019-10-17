package Pertemuan6;

public class Main6 {
    public static void main(String[] args) {

        int[][] matriks1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matriks2 = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
        int[][] matriks3 = {
                {1,2},
                {3,4}
        };
        int[][] matriks4 = {
                {11,12},
                {13,14}
        };

        System.out.println("MATRIKS 1");
        printArray(matriks1);
        System.out.println("MATRIKS 2");
        printArray(matriks2);
        System.out.println("MATRIKS 3");
        printArray(matriks3);
        System.out.println("MATRIKS 4");
        printArray(matriks4);

        System.out.println("HASIL TAMBAH");
        int [][] hasilTambah = tambahArray(matriks1,matriks2);
        printArray(hasilTambah);
        System.out.println("HASIL KALI");
        int [][] hasilKali = kaliArray(matriks3,matriks4);
        printArray(hasilKali);

    }

    private static int[][] tambahArray(int[][] matriks1, int[][] matriks2) {
        int baris1 = matriks1.length;
        int kolom1 = matriks1[0].length;
        int baris2 = matriks2.length;
        int kolom2 = matriks2[0].length;

        int[][] hasilTambah = new int[baris1][kolom1];
        if (baris1 == baris2 && kolom1 == kolom2) {
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasilTambah[i][j] = matriks1[i][j] + matriks2[i][j];
                }
            }
        }else{
            System.out.println("JUMLAH KOLOM/BARIS HARUS SAMA");
        }
        return hasilTambah;
    }

    private static int[][] kaliArray(int[][]matriks3,int[][] matriks4){
        int baris3 = matriks3.length;
        int kolom3 = matriks3[0].length;
        int baris4 = matriks4.length;
        int kolom4 = matriks4[0].length;

        int [][] hasilKali = new int[baris3][kolom4];
        int temp;
        if (baris3 == kolom4 && baris4 == kolom3) {
            for (int i = 0; i < baris3; i++) {
                for (int j = 0; j < kolom4; j++) {
                    temp = 0;
                    for (int k = 0; k < kolom3; k++) {
                        temp += matriks3[i][k] * matriks4[k][j];
                    }
                    hasilKali[i][j] = temp;
                }
            }
        }else{
            System.out.println("JUMLAH KOLOM1 DAN BARIS2 HARUS SAMA");
        }
        return hasilKali;
    }

    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i=0; i<baris;i++){
            System.out.print("[");
            for (int j=0; j<kolom; j++){
                System.out.print(dataArray[i][j]);
                if (j < (kolom-1)){
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
