package Fathur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BacaData {
    public void membacaData(){
        Koneksi conn = new Koneksi("localhost/foltak","root","foltak98");
        TulisFile tulisFile = new TulisFile();

        String query = "SELECT ID_USER, FIRST_NAME, LAST_NAME, CITY, COUNTRY FROM BIODATA";

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        String th1 = "| %-3s | %-15s | %-15s | %-30s | %-40s |%n";
        String th2 = "+ %-3s + %-15s + %-15s + %-30s + %-40s +%n";

        try {

            statement = conn.getKoneksi().prepareStatement(query);
            resultSet = statement.executeQuery();

            String baris1 = String.format(th2, "---","---------------","---------------","------------------------------","----------------------------------------");
            String baris2 = String.format(th1, "ID" ,"   FIRST NAME  ","   LAST NAME   ","              CITY            ","                  COUNTRY               ");
            String baris3 = String.format(th2, "---","---------------","---------------","------------------------------","----------------------------------------");
            tulisFile.menulisFile(baris1,false);
            tulisFile.menulisFile(baris2,true);
            tulisFile.menulisFile(baris3,true);

            while (resultSet.next()) {

                String data = String.format(th1,
                        resultSet.getString("ID_USER"),
                        resultSet.getString("FIRST_NAME"),
                        resultSet.getString("LAST_NAME"),
                        resultSet.getString("CITY"),
                        resultSet.getString("COUNTRY"));

                tulisFile.menulisFile(data, true);
            }
            tulisFile.menulisFile(baris3,true);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}