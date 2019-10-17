package Pertemuan1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fn, fn1, fn2, n;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Banyaknya angka Fibonacci = ");
        n = inputuser.nextInt();

        fn2=0;
        fn1=1;
        fn=1;
        //System.out.println("Nilai ke "+1+" adalah "+fn2);
        System.out.print("[ "+fn2+" ");
        for (int i =1; i<n; i++){
            //System.out.println("Nilai ke "+(i+1)+" adalah "+fn);
            System.out.print(fn+" ");
            fn = fn2+fn1;
            fn2 = fn1;
            fn1 = fn;
        }
        System.out.println("]");
    }
}
