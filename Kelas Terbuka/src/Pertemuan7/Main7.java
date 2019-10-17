package Pertemuan7;

public class Main7 {
    public static void main(String[] args) {

        String maca1 = "handuk";
        String maca2 = "helimut";

        System.out.println(maca1.charAt(2));
        System.out.println(maca1.substring(1,3));
        System.out.println(maca1.toLowerCase());
        System.out.println(maca1.toUpperCase());
        System.out.println(maca1.replace("handuk","sendok"));
        System.out.println(maca1.equals(maca2));
        System.out.println(maca1.compareTo(maca2));
    }

}
