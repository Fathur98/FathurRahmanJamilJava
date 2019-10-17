package Fathur;
public class Main {

    public static void main(String[] args){

        JavaDeveloper java = new JavaDeveloper("Otong", 3000d, 4);
        Base24Developer base1 = new Base24Developer("Surotong", 3000d, 7, Boolean.FALSE);
        Base24Developer base2 = new Base24Developer("Suhotong", 5000d, 7, Boolean.TRUE);
        PHPDeveloper php = new PHPDeveloper("Markotong", 6000d, 7);

        System.out.println(" ");
        System.out.println("JAVA DEVELOPER");
        System.out.println("NAMA KARYAWAN   : "+java.getNama());
        System.out.println("GAJI            : "+java.getGaji());
        System.out.println("LEMBUR          : "+java.getLembur(3));
        System.out.println("GRADE           : "+java.getGrade());

        System.out.println(" ");
        System.out.println("BASE 24 DEVELOPER");
        System.out.println("NAMA KARYAWAN   : "+base1.getNama());
        System.out.println("GAJI            : "+base1.getGaji());
        System.out.println("LEMBUR          : "+base1.getLembur(3));
        System.out.println("GRADE           : "+base1.getGrade());

        System.out.println(" ");
        System.out.println("BASE 24 DEVELOPER");
        System.out.println("NAMA KARYAWAN   : "+base2.getNama());
        System.out.println("GAJI            : "+base2.getGaji());
        System.out.println("LEMBUR          : "+base2.getLembur(3));
        System.out.println("GRADE           : "+base2.getGrade());

        System.out.println(" ");
        System.out.println("PHP DEVELOPER");
        System.out.println("NAMA KARYAWAN   : "+php.getNama());
        System.out.println("GAJI            : "+php.getGaji());
        System.out.println("LEMBUR          : "+php.getLembur(3));
        System.out.println("GRADE           : "+php.getGrade());
    }
}
