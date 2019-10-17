package Fathur;
public class JavaDeveloper extends Karyawan {

    public JavaDeveloper(String nama, Double gaji, Integer grade){
        super(nama, gaji, grade);
    }

    @Override
    public Double getLembur(Integer durasi){
        return (250000d * durasi) + 50000d;
    }

}
