package Fathur;

public class Aplikasi {
    public static void main(String[] args) {

        ResetID resetId = new ResetID();
        resetId.meresetID();

        BacaFile latihan = new BacaFile();
        latihan.membacaFile();
        System.out.println("DATA BERHASIL DITAMBAHKAN KE DATABASE");

        BacaData bacaData = new BacaData();
        bacaData.membacaData();
        System.out.println("FILE BERHASIL DIBUAT");

    }
}