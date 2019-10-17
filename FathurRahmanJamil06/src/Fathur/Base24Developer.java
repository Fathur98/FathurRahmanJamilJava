package Fathur;
public class Base24Developer extends Karyawan {

    private Boolean sertifikasi;

    public Base24Developer(String nama, Double gaji, Integer grade, Boolean sertifikasi) {
        super(nama, gaji, grade);
        this.sertifikasi = sertifikasi;
    }

    @Override
    public Double getLembur(Integer durasi){
        if (sertifikasi == true){
            return 2000000d * durasi;
        } else {
            return 100000d * durasi;
        }
    }
}
