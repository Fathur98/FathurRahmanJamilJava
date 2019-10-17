package controller;

public class Controller {
    public String propor(Integer tinggi, Integer berat){
        String hasil = " ";
        float tinggibadan = (float) tinggi;
        float beratbadan = (float) berat;
        float propor;
        propor = beratbadan / (tinggibadan * tinggibadan / 10000);

        if (propor < 18.5){
            hasil = "Berat badan anda kurang";
        }else if (propor < 25.5){
            hasil = "Berat badan anda normal";
        }else if (propor < 29.9){
            hasil = "Berat badan anda berlebihan";
        }else if (propor > 30){
            hasil = "Berat badan anda obesitas";
        }else{
            hasil = "Masukkan berat badan";
        }
        return  hasil;
    }
}
