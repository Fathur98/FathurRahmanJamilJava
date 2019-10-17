package Fathur;
import java.sql.*;

public class Koneksi {
    private Connection koneksi;

    public Koneksi(String url, String username, String password) {
        konek(url, username, password);
    }

    public void konek(String url, String username, String password) {
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://" + url, username, password);
        } catch (SQLException e) {
            System.out.println("KONEKSI TIDAK BERHASIL");
            e.printStackTrace();
        }
    }

    public Connection getKoneksi(){
        return koneksi;
    }
}