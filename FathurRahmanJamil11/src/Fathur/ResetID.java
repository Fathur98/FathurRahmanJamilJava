package Fathur;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResetID {
    public void meresetID(){
        Koneksi conn = new Koneksi("localhost/foltak","root","foltak98");

        String query = "TRUNCATE TABLE BIODATA;";
        PreparedStatement statement = null;

        try {

            statement = conn.getKoneksi().prepareStatement(query);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}