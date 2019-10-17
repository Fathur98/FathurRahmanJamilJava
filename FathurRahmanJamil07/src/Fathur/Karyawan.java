package Fathur;
public class Karyawan {
    private String nama;
    private Integer gaji;
    int getGaji;

    public Karyawan(String nama, Integer gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama(){
        return nama;
    }

    public Integer getGaji(){
        return gaji;
    }

}
