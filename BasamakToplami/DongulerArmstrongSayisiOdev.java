import java.util.Scanner;
public class DongulerArmstrongSayisiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        int sayi = input.nextInt();

        int tempnumber = sayi;
        int toplam=0;
        int basamakdegeri;
        int basToplami=0;
        int basamaksayisi=0;

        while (tempnumber != 0){
            tempnumber /= 10;
            basamaksayisi++;
        }
        System.out.println("Basamak Sayısı:" + basamaksayisi);
        tempnumber = sayi;

        for(int i=1; i<=basamaksayisi; i++){
            basamakdegeri = tempnumber % 10;
            tempnumber /= 10;
            basToplami += basamakdegeri;
        }
        toplam+=basToplami;
        System.out.println("Basamak Sayılarının Toplamı:"+toplam);

    }
}
