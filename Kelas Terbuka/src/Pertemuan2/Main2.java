package Pertemuan2;

public class Main2 {
    public static void main(String[] args) {

        printAngka(10);
        printAngka(10.5f);
        printAngka(10.5);
        System.out.println(tambah(10,3));
        System.out.println(tambah(10.6,3));
        System.out.println(tambah(10.6f,3));

    }
    private static void printAngka(int angkaInteger){
        System.out.println(angkaInteger);
    }
    private static void printAngka(float angkaFloat){
        System.out.println(angkaFloat);
    }
    private static void printAngka(double angkaDouble){
        System.out.println(angkaDouble);
    }
    private static int tambah(int angkaInteger1, int angkaInteger2){
        return angkaInteger1 + angkaInteger2;
    }
    private static float tambah(float angkaFloat1, float angkaFloat2){
        return angkaFloat1 + angkaFloat2;
    }
    private static double tambah(double angkaDouble1, double angkaDouble2){
        return angkaDouble1+angkaDouble2;
    }
}
