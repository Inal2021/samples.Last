package ProjectQuestion_Nilufer;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {
    public static void main(String[] args) {
        HashMap <Integer, String> sinif=new HashMap<>();
        sinif.put(110, "Abdulcabbar Ipatlar - 9/A");
        sinif.put(120, "Abdulmecit Üstgecit - 6/C");
        sinif.put(130, "Murat Görürbakmaz - 8/A");
        sinif.put(140, "Hakan Duyardinlemez - 6/C");
        sinif.put(150, "Metruk Mesruk - 5/C");

        // yeni bir ögrenci girisi yapin. Varolan nmara ile kayit yapilmaya calisildiginda
        // o numarali kaydin oldugunu ve o numaraya ait kisinin bilgisini getirsin.
        // eger belirtilen numara kayitli degilse kaydiniz eklenmistir desin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ögrenci no giriniz: ");
        int num=scan.nextInt();
        System.out.println("Ögrenci ismi giriniz: ");
        String name= scan.nextLine();

        if(sinif.putIfAbsent(num, name)==null){

            System.out.println(sinif.get(num)  + "ogrenci eklenmistir");
        } else {
            System.out.println("Ilgili numara dolu!!!" );
        }

        // Bir numara girildiginde o kisiye ait sinif bilgisini bize gosterisn,
        // Eger kayit yoksa böyle bir kayit yok desin

        if (sinif.containsKey(num)) {
            sinif.containsValue()
        }









    }
}
