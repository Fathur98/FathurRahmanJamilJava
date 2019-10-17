package Fathur;
import java.math.BigDecimal;

public class Main {
    public static void main( String[] args ) {

        if (args.length==1){
            int n = Integer.parseInt(args[0]);
            long fib[] = new long[n+1];

            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i<=n; i++){
                fib [i] = fib[i-1] + fib [i-2];
            }

            for (int i = 0; i<=n; i++){
                if (fib[i]%10==3 | fib[i]%10==6 | fib[i]%10==9){
                    System.out.print(i+" : "+fib[i]%10+"\n");
                    //System.out.print(i+" : -"+"\n");
                }else{
                    System.out.print(i+" : "+fib[i]+"\n");
                }
            }
        }else{
            System.out.println("Masukan Jumlah Arraynya");
        }
        // if (args.length==2){
        // 	int x = Integer.parseInt(args[0]);
        // 	int y = Integer.parseInt(args[1]);
        // 	int z = 0;
        // 	int i;

        // 	if (x<y){
        // 		for (i=x;i<=y;i++){
        // 		z += i;
        // 		}
        // 	System.out.println("sum from ("+x+","+y+") :"+z);

        // 	}else{
        // 		for (i=y;i<=x;i++){
        // 		z += i;
        // 		}
        // 	System.out.println("sum from ("+y+","+x+") :"+z);
        // 	}

        // }else{
        // 	int x = Integer.parseInt(args[0]);
        // 	int y = 0;
        // 	int z = 0;
        // 	int i;

        // 	for (i=y;i<=x;i++){
        // 		z += i;
        // 	}
        // 	System.out.println("sum from ("+y+","+x+") :"+z);

        // }

        // int x = Integer.parseInt(args[0]);
        // if (x<10){
        // 	System.out.println("satu digit");
        // }else if(x<100){
        // 	System.out.println("dua digit");
        // }else if(x<1000){
        // 	System.out.println("tiga digit");
        // }else{
        // 	System.out.println("lebih dari tiga digit");
        // }


        // System.out.println("Hello Word");
        // Integer a = 200;
        // CetakAngka();

        // static void CetakAngka(){
        // 	Integer a = 20;
        // 	System.out.println(a);
        // }

        // BigDecimal bigDecimalA = new BigDecimal(50);
        // BigDecimal bigDecimalB = new BigDecimal (125);
        // BigDecimal bigDecimalC = bigDecimalA.multiply(bigDecimalB);

        // System.out.println (bigDecimalC);

        // int a = 5;
        // Integer b = 12;

        // System.out.println ((float)b/a);

        // Integer kelipatan = 7;
        // Integer bilangan = 8; // selain 1 dan 2
        // String c="";
        // Integer d=0;
        // String e="";
        // String b = kelipatan % 3 == 0 ? "Kelipatan 3" : "Bukan kelipatan 3";
        // for (int b=2; b<bilangan; b++){
        // 	d+=bilangan%b==0?1:0;
        // }
        // c = d == 0||bilangan ==2 ? "Bilangan Prima" : "Bukan Bilangan Prima";
        // System.out.print(c);

        // String namaAwal = "FR";
        // String namaAkhir ="";
        // int length = namaAwal.length();
        // for (int i=length-1;i>=0;i--){
        // 	namaAkhir += namaAwal.charAt(i);
        // }
        // System.out.println(namaAkhir);

        // int x = 3;
        // if (x==3){
        // 	System.out.println("It's three!");
        // }
        // System.out.println ("Whatever.");

        // int x = 32550;
        // int y = x%100;
        // if (x%100>=51){
        // 	int d = 100-y;
        // 	int z = x+d;
        // 	System.out.println(z);
        // }else{
        // 	int z = x-y;
        // 	System.out.println(z);
        // }

        // int a = 234;
        // int b = 245;
        // int c = 287;

        // int d = a/100;
        // int e = b/100;
        // int f = c/100;

        // int g = d-e;
        // int h = d-f;
        // int i = e-f;

        // if (0<=d-e<1 && 0<d-f<1 && 0<e-f<1){
        // 	System.out.println("Bilangan Sama Besar");
        // }else if(-1<=d-e<0 && -1<=d-f<0 && -1<=e-f<0){
        // 	System.out.println("Bilangan Menurun");
        // }else if(2>d-e>=1 && d-f>=1 && e-f>=1){
        // 	System.out.println("Bilangan Naik");
        // }else{
        // 	System.out.println("Bilangan Tidak Berurutan");
        // }

    }
}
