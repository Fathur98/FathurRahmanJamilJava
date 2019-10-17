package Fathur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String query1 = "SELECT * FROM EMPLOYEE";
        tampil(query1);

        String query2 = "INSERT INTO EMPLOYEE (FIRST_NAME, LAST_NAME, START_DATE, TITLE) VALUES ('Fathur','Rahman','20190930','Satpam')";
        tambah(query2);

        Scanner data = new Scanner(System.in);
        System.out.println("MASUKKAN NAMA DEPAN");
        String namaDepan = data.next();
        System.out.println("MASUKKAN NAMA BELAKANG");
        String namaBelakang = data.next();
        System.out.println("MASUKKAN TANGGAL MASUK");
        String tanggalMasuk = data.next();
        System.out.println("MASUKKAN POSISI BEKERJA");
        String posisiBekerja = data.next();

        String query3 = "INSERT INTO EMPLOYEE (FIRST_NAME, LAST_NAME, START_DATE, TITLE) VALUES ('"+namaDepan+"','"+namaBelakang+"','"+tanggalMasuk+"','"+posisiBekerja+"')";
        tambah(query3);
    }

    private static void tampil (String query){
        ConnectionDB conn = new ConnectionDB("localhost/foltak", "root", "foltak98");
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = conn.getConnection().prepareStatement(query);
            result = statement.executeQuery();
            while (result.next()){
            System.out.println(result.getString("FIRST_NAME")+" "+result.getString("LAST_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("INPUT GAGAL");
        } finally {
            conn.close(result,statement);
        }
    }

    private static void tambah (String query){
        ConnectionDB conn = new ConnectionDB("localhost/foltak", "root", "foltak98");
        try {
            PreparedStatement statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("INPUT GAGAL");
        }
    }
}
