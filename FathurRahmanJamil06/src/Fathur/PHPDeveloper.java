package Fathur;
public class PHPDeveloper extends Karyawan {

    Integer grade;

    public PHPDeveloper(String nama, Double gaji, Integer grade) {
        super(nama, gaji, grade);
        this.grade = grade;
    }

    @Override
    public Double getLembur(Integer durasi){
        Integer tunjangan;
        if (grade <= 3) {
            tunjangan = 20000;
        } else if (grade > 3){
            tunjangan = 100000;
        } else if (grade > 10) {
            tunjangan = 150000;
        } else {
            tunjangan = 0;
        }
        return (200000d*durasi)+tunjangan;
    }
}
