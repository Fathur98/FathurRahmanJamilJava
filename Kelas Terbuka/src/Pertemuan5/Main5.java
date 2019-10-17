package Pertemuan5;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Array 2 Dimensi");

        int[][] array1 = {
                {1,2},
                {2,3}
        };
        printArray(array1);

        int[][] array2 = new int[5][4];
        loopingArray(array2);
        loopingArray1(array2);
        loopingArray2(array2);
    }
    private static void loopingArray2(int[][] array){
        for (int[] baris : array){
            System.out.print("[ ");
            for (int angka : baris){
                System.out.print(angka+" ");
            }
            System.out.println("]");
        }
    }
    private static void loopingArray1(int[][] array){
        for (int i=0;i<array.length-1;i++){
            System.out.print("[ ");
            for (int j=0;j<array.length-1;j++){
            System.out.print(array[i][j]+" ");
            }
            System.out.println("]");
        }
    }
    private static void loopingArray(int[][] array){
        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
    private static void printArray(int[][] array){
        System.out.println(Arrays.deepToString(array));
    }
}
