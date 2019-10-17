package Latihan;

import java.sql.*;

public class ConnectionDB {
    private Connection connection;

    public ConnectionDB(String url, String username, String password) {
        connect(url, username, password);
    }

    public void connect(String url, String username, String password) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + url, username, password);
            //System.out.println("KONEKSI BERHASIL");
        } catch (SQLException e) {
            System.out.println("KONEKSI TIDAK BERHASIL");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void close(ResultSet result, PreparedStatement statement){
        try{
            if(result != null){
                result.close();
                //System.out.println("RESULTSET CLOSED");
            }
            if(statement != null){
                statement.close();
                //System.out.println("STATEMENT CLOSED");
            }
            if(connection != null){
                connection.close();
                //System.out.println("CONNECTION CLOSED");
            }
        } catch (SQLException e) {
            //System.out.println("GAGAL MENGHENTIKAN KONEKSI!");
        }
    }
}
