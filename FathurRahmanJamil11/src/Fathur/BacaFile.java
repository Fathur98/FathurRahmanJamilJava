package Fathur;
import java.io.*;

public class BacaFile{
    public void membacaFile(){
        File file = new File("D:"+File.separator+"data input.csv");
        TambahData identitas = new TambahData();

        String[] split;

        try {

            BufferedReader buffer = new BufferedReader(new FileReader(file));

            String test = "";
            int baris =0;
            int jumlahData=0;

            while ((test = buffer.readLine())!=null){
                split = test.split(";");

                if (baris == 0){
                    baris++;
                    continue;
                }

                for (int i = 0; i<=(split.length-1); i++){

                    if (split[i].contains("\"")){
                        split[i]=split[i].replace("\"","");
                    }
                }
                System.out.println("DATA KE - "+(jumlahData+1)+" BERHASIL DITAMBAHKAN");

                identitas.menambahData(split);
                jumlahData+=1;

            }

            System.out.println("DATA SEBANYAK "+jumlahData+" BERHASIL DIBACA");

        } catch (FileNotFoundException e) {
            System.out.println("FILE TIDAK DITEMUKAN");

        } catch (IOException e) {
            System.out.println("DATA TIDAK BERHASIL DITAMBAHKAN");
        }
    }
}

