package Fathur;
public class Persegi extends BangunDatar {
    //public class Persegi implements BangunDatar {
    public float sisi;

    public float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    public float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
