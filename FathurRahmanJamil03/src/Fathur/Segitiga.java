package Fathur;
public class Segitiga extends BangunDatar {
    //public class Segitiga implements BangunDatar {
    public float alas;
    public float tinggi;

    public float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

}
