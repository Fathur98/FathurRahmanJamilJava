package Pertemuan3;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("Mengubah array menjadi string");
        int[] arrayAngka1 ={1,2,3,4,5};
        printArray(arrayAngka1);

        System.out.println("Mengkopi array dengan copy of");
        int[] arrayAngka2 = Arrays.copyOf(arrayAngka1,5);
        printArray(arrayAngka2);

        System.out.println("Mengkopi array dengan copy of range");
        int[] arrayAngka3 = Arrays.copyOfRange(arrayAngka1,0,4);
        printArray(arrayAngka3);

        System.out.println("Mengisi array yang sama");
        int[] arrayAngka4 = new int[5];
        Arrays.fill(arrayAngka4,6);
        printArray(arrayAngka4);

        System.out.println("Komparasi array");
        int[] arrayAngka5 = {1,2,3};
        int[] arrayAngka6 = {1,2,3};
        if (Arrays.equals(arrayAngka5,arrayAngka6)) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak");
        }

//        System.out.println("Cek array lebih besar");
//        System.out.println(Arrays.compare(arrayAngka5,arrayAngka6));

//        System.out.println("Cek indeks array yang berbeda");
//        System.out.println(Arrays.mismatch(arrayAngka5,arrayAngka6));

        System.out.println("Sorting array");
        int[] arrayAngka7 = {1,2,3,4,5,6,7};
        printArray(arrayAngka7);
        Arrays.sort(arrayAngka7);
        int angka = 4;
        int posisi = Arrays.binarySearch(arrayAngka7,angka);
        System.out.println("posisi "+angka+" ada di index "+posisi);

    }

    private static void printArray(int[] dataArray){
        System.out.println(Arrays.toString(dataArray));
    }
}
