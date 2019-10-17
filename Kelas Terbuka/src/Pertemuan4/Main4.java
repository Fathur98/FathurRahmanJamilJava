package Pertemuan4;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = {5,6,7,8,9};
        printArray(arrayAngka1,"Array 1 =");
        printArray(arrayAngka2,"Array 2 =");

        System.out.println("PENJUMLAHAN ARRAY");
        int[] arrayHasil = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayHasil,"Tambah =");

        System.out.println("GABUNGAN 2 ARRAY");
        int[] arrayHasil2= new int [arrayAngka1.length+arrayAngka2.length];
        gabunganArray(arrayAngka1,arrayAngka2,arrayHasil2);
        printArray(arrayHasil2,"Gabung =");

        System.out.println("MEMBALIKAN ARRAY");
        membalikanArray2(arrayAngka2);
        printArray(arrayAngka2,"Dibalik =");

        System.out.println("SWITCH ARRAY");
        membalikanArray(arrayAngka1);
        printArray(arrayAngka1,"Switch =");
    }

    private  static void gabunganArray(int[] array1,int[] array2,int[] array3){
        for (int i=0; i<array1.length; i++){
            array3[i]=array1[i];
        }
        for (int i=0; i<array2.length; i++){
            array3[i+array1.length]=array2[i];
        }
    }
    private static void membalikanArray2(int[] array1){
        Arrays.sort(array1);
        for (int i=0; i<array1.length; i++){
            array1[i]=array1[(array1.length-1)-i];
        }
    }
    private static void membalikanArray(int[] array1){
        Arrays.sort(array1);
        int temp;
        for (int i=0; i<array1.length/2; i++){
            temp = array1[i];
            array1[i]=array1[(array1.length-1)-i];
            array1[(array1.length-1)-i]=temp;
        }
    }
    private static int[] tambahArray(int[] array1, int[] array2){
        int[] arrayHasil = new int[array1.length];
        for (int i=0; i<array1.length;i++){
            arrayHasil[i] = array1[i]+array2[i];
        }
        return arrayHasil;
    }
    private static void printArray(int[] dataArray, String pesan){
        System.out.println(pesan+ Arrays.toString(dataArray));
    }
}
