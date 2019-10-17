package model;

public class BootcampMember {
    private String nama, jenis, pendidikan, jurusan, riwayat,nilai;
    private int tinggibadan, beratbadan;

    public BootcampMember(String nama, String jenis, String pendidikan, String jurusan, String riwayat, Integer tinggibadan, Integer beratbadan, String nilai) {
        this.nama = nama;
        this.jenis = jenis;
        this.pendidikan = pendidikan;
        this.jurusan = jurusan;
        this.riwayat = riwayat;
        this.tinggibadan = tinggibadan;
        this.beratbadan = beratbadan;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }

    public int getTinggibadan() {
        return tinggibadan;
    }

    public void setTinggibadan(int tinggi) {
        this.tinggibadan = tinggi;
    }

    public int getBeratbadan() {
        return beratbadan;
    }

    public void setBeratbadan(int berat) {
        this.beratbadan = berat;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}