package Fathur;

import java.io.*;
import java.util.*;

public class Cobaan4{
    public static void main(String[] args) {
        String fileName = "D:"+File.separator+"Data.txt";
        File file = new File(fileName);
        Map<Integer, List<String>> dataMahasiswa = new HashMap<>();
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(file));
            String stringDataFile = "";
            int i =0;
            while((stringDataFile = bf.readLine())!=null){
                if(i>0){
                    String[] data = stringDataFile.split("\\|");
                    if(data.length==2){
                        Integer kelas = Integer.parseInt(data[1].replace(" ",""));
                        if(dataMahasiswa.get(kelas)!=null){
                            dataMahasiswa.get(kelas).add(data[0]);
                        }else{
                            ArrayList<String> dat = new ArrayList();
                            dat.add(data[0]);
                            dataMahasiswa.put(kelas,dat);
                        }
                    }
                }
                i++;
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Error ketika membaca file");
        }

        dataMahasiswa.forEach((x,v)->{
            System.out.println("Kelas "+x+" terdiri dari "+v.size()+" orang\n" +
                    "siswanya adalah");
            if(v.size()==1){
                System.out.println(v.get(0));
            }else if(v.size()==2){
                System.out.println(v.get(0)+"dan "+v.get(1));
            }else{
                if(v.size()>0){
                    String pen = "";
                    for(int i=0;i<v.size()-2;i++){
                        pen = pen+v.get(i)+",";
                    }
                    pen = pen + v.get(v.size()-2) +"dan "+ v.get(v.size()-1);
                    System.out.println(pen);
                }
            }
        });
    }
}
