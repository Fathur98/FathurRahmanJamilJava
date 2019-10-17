package Fathur;

import java.sql.*;

public class TambahData {
    Koneksi conn = new Koneksi("localhost/foltak","root","foltak98");

    public void menambahData(String[] data) {

        String query = "INSERT INTO BIODATA (FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, DISTRICT, CITY, COUNTRY) VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"','"+data[5]+"','"+data[6]+"')";
        PreparedStatement statement = null;

        try {

            statement = conn.getKoneksi().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {

            System.out.println("INSERT GAGAL");
            e.printStackTrace();

        }
    }
}