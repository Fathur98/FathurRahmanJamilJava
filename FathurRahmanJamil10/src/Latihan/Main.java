package Latihan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("1. VIEW ALL CUSTOMER");
        System.out.println("2. VIEW BUSINESS COSTUMER");
        System.out.println("3. VIEW INDIVIDUAL CUSTOMER");
        System.out.println("4. INSERT CUSTOMER");
        System.out.println("5. SEARCH CUSTOMER");

        System.out.println("MASUKKAN PILIHAN ANDA");
        int pilihan = data.nextInt();
        System.out.println("=========================================");

        if (pilihan == 1){
            String query1 = "SELECT NAME, ADDRESS, CITY, INCORP_DATE FROM CUSTOMER CU INNER JOIN BUSINESS BU ON CU.CUST_ID = BU.CUST_ID";
            tampilBusiness(query1);
            String query2 = "SELECT BIRTH_DATE, ADDRESS, CITY, FIRST_NAME, LAST_NAME FROM CUSTOMER CU INNER JOIN INDIVIDUAL IND ON CU.CUST_ID = IND.CUST_ID";
            tampilIndividual(query2);
        }else if (pilihan == 2){
            String query1 = "SELECT NAME, ADDRESS, CITY, INCORP_DATE FROM CUSTOMER CU INNER JOIN BUSINESS BU ON CU.CUST_ID = BU.CUST_ID";
            tampilBusiness(query1);
        }else if (pilihan == 3) {
            String query2 = "SELECT BIRTH_DATE, ADDRESS, CITY, FIRST_NAME, LAST_NAME FROM CUSTOMER CU INNER JOIN INDIVIDUAL IND ON CU.CUST_ID = IND.CUST_ID";
            tampilIndividual(query2);
        }else if (pilihan == 4) {
            insertCustomer();
        }else if(pilihan == 5){
            cariCust();
        }else{
            System.out.println("NUMBER WRONG");
        }
    }

    private static void tampilBusiness (String query){
        ConnectionDB conn = new ConnectionDB("localhost/foltak", "root", "foltak98");
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = conn.getConnection().prepareStatement(query);
            result = statement.executeQuery();
            while (result.next()){
                System.out.print("NAMA PERUSAHAAN   = "+result.getString("NAME")+"\n");
                System.out.print("TANGGAL BERDIRI   = "+result.getString("INCORP_DATE")+"\n");
                System.out.print("ALAMAT            = "+result.getString("ADDRESS")+"\n");
                System.out.print("KOTA              = "+result.getString("CITY")+"\n");
                System.out.println("=========================================");
            }
        } catch (SQLException e) {
            System.out.println("INPUT GAGAL");
            e.printStackTrace();
        } finally {
            conn.close(result,statement);
        }
    }

    private static void tampilIndividual (String query){
        ConnectionDB conn = new ConnectionDB("localhost/foltak", "root", "foltak98");
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = conn.getConnection().prepareStatement(query);
            result = statement.executeQuery();
            while (result.next()){
                System.out.print("NAMA          = "+result.getString("FIRST_NAME")+" "+result.getString("LAST_NAME")+"\n");
                System.out.print("TANGGAL LAHIR = "+result.getString("BIRTH_DATE")+"\n");
                System.out.print("ALAMAT        = "+result.getString("ADDRESs")+"\n");
                System.out.print("KOTA          = "+result.getString("CITY")+"\n");
                System.out.println("=========================================");
            }
        } catch (SQLException e) {
            System.out.println("INPUT GAGAL");
            e.printStackTrace();
        } finally {
            conn.close(result,statement);
        }
    }

    private static void insertCustomer(){
        Scanner data = new Scanner(System.in);
        System.out.println("1. CUSTOMER BUSINESS");
        System.out.println("2. COSTOMER INDIVIDUAL");
        System.out.println("MASUKKAN PILIHAN ANDA");
        int pilihan = data.nextInt();

        if (pilihan == 1){
            System.out.println("MASUKKAN TANGGAL BERDIRI PERUSAHAAN");
            String tanggal = data.next();
            System.out.println("MASUKKAN NAMA PERUSAHAAN");
            String nama = data.next();
            System.out.println("MASUKKAN STATE ID PERUSAHAAN (8 HURUF)");
            String state = data.next();
            System.out.println("MASUKKAN CUST ID PERUSAHAAN (2 HURUF)");
            String cust = data.next();

            String query3 = "INSERT INTO BUSINESS (INCORP_DATE, NAME, STATE_ID, CUST_ID) VALUES ('"+tanggal+"','"+nama+"','"+state+"','"+cust+"')";
            tambah(query3);

        } else if (pilihan == 2){
            System.out.println("MASUKKAN TANGGAL MASUK");
            String tanggalLahir = data.next();
            System.out.println("MASUKKAN POSISI BEKERJA");
            String namaDepan = data.next();
            System.out.println("MASUKKAN POSISI BEKERJA");
            String namaBelakang = data.next();

            String query3 = "INSERT INTO INDIVIDUAL (BIRTH_DATE,FIRST_NAME, LAST_NAME) VALUES ('"+tanggalLahir+"','"+namaDepan+"','"+namaBelakang+"')";
            tambah(query3);
        }else{
            System.out.println("NUMBER WRONG");
        }
    }

    private static void tambah (String query){
        ConnectionDB conn = new ConnectionDB("localhost/foltak", "root", "foltak98");
        try {
            PreparedStatement statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("INPUT GAGAL");
            e.printStackTrace();
        }
    }

    private static void cariCust(){
        Scanner data = new Scanner(System.in);
        System.out.println("1. MENCARI CUSTOMER BUSINESS");
        System.out.println("2. MENCARI CUSTOMER INDIVIDUAL");
        System.out.println("MASUKKAN PILIHAN ANDA");
        int pilih = data.nextInt();
        System.out.println("=========================================");
        if (pilih==1) {
            System.out.println("MASUKKAN NAMA PERUSAHAAN YANG ANDA CARI");
            String pilihan = data.next();
            System.out.println("=========================================");
            String query1 = "SELECT NAME, ADDRESS, CITY, INCORP_DATE FROM CUSTOMER CU INNER JOIN BUSINESS BU ON CU.CUST_ID = BU.CUST_ID WHERE NAME LIKE '%"+pilihan+"%'";
            tampilBusiness(query1);

        }else if (pilih==2){
            System.out.println("MASUKKAN NAMA DEPAN CUSTOMER YANG ANDA CARI");
            String pilihan = data.next();
            System.out.println("=========================================");
            String query1 = "SELECT BIRTH_DATE, ADDRESS, CITY, FIRST_NAME, LAST_NAME FROM CUSTOMER CU INNER JOIN INDIVIDUAL IND ON CU.CUST_ID = IND.CUST_ID WHERE FIRST_NAME LIKE '%" +pilihan+ "%'";
            tampilIndividual(query1);

        }else{
            System.out.println("TIDAK ADA");
        }
    }
}