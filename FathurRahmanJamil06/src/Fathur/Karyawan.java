package Fathur;
public class Karyawan {
    private String nama;
    private Double gaji;
    private Integer grade;

    public Karyawan(String nama, Double gaji,Integer grade){
        this.nama = nama;
        this.gaji = gaji;
        this.grade = grade;
    }

    public Double getLembur(Integer durasi){
        return durasi * 100000d;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Double getGaji(){
        return gaji;
    }

    public void getGaji(Double gaji){
        this.gaji = gaji;
    }

    public Integer getGrade(){
        return grade;
    }

    public void getGrade(Integer grade){
        this.grade = grade;
    }
}

