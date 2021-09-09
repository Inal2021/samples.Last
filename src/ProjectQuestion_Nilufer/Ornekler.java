package ProjectQuestion_Nilufer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        /*
 	  1- Kullanıcıdan birçok kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
      2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
      3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
      4- Tüm kullanicilarin isimlerini ekrana yazdiralim.
 */
        Scanner scan = new Scanner(System.in);
        String secim;
        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

do {

    HashMap<String, String> kisiBilgileri = new HashMap<>();

    System.out.println("4 haneli kimlik no giriniz: ");
    kisiListesi.put(scan.nextInt(), kisiBilgileri);

    System.out.println("Isminizi giriniz: ");
    kisiBilgileri.put("ad", scan.nextLine());

    scan.nextLine();
    System.out.println("adresinizi giriniz: ");
    kisiBilgileri.put("adres", scan.nextLine());

    System.out.println("telefon no giriniz: ");
    kisiBilgileri.put("telefon", scan.next());

    System.out.println(kisiBilgileri);
    System.out.println(kisiListesi);
    System.out.println("Devam etmek ister isiniz? E/H ");
    secim=scan.nextLine();

}
while (secim.equalsIgnoreCase("E"));

        System.out.println("görüntülemek istediginiz kisinin kimlik no girin: ");
        System.out.println(kisiListesi.get(scan.nextInt()));


    }
}
