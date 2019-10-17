package Fathur;
public class Array {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(sum("makan","makan"));
        System.out.println(sum(1,2));
        System.out.println(sum("makan",1));
    }

    static String sum (String a, String b){
        return a+b;
    }

    static Integer sum (int x,int y){
        return x+y;
    }

    static String sum (String b,int c){
        String x = String.valueOf (c);
        return b+x;
    }
}