package ProjectQuestion_Nilufer;

import java.util.HashMap;
import java.util.Map;


public class NestedMap {
    public static void main(String[] args) {

        /*
        * kimlikNo
        * ad: Hakan
        * soyad: Inal
        * bolum: dev
        *
        * kimlikNo
        * ad: Asli
        * soyad: Inal
        * bolum: English Teacher
        */

        HashMap<Integer, HashMap<String,String>> kisiListesi=new HashMap<>();

        HashMap <String, String> kisiBilgi=new HashMap<>();
        kisiBilgi.put("ad","Asli");
        kisiBilgi.put("soyad","Inal");
        kisiBilgi.put("bolum","English Teacher");

        HashMap <String, String> kisiBilgi1=new HashMap<>();
        kisiBilgi1.put("ad","Hakan");
        kisiBilgi1.put("soyad","Inal");
        kisiBilgi1.put("bolum","dev");

        kisiListesi.put(251535, kisiBilgi);
        kisiListesi.put(169856, kisiBilgi1);

        System.out.println(kisiListesi);

        //MAP lerden data getirme;

        System.out.println(kisiListesi.get(251535)); // {ad=Asli, soyad=Inal, bolum=English Teacher} ==>> mapte get() metodu ile KEY e karsilik gelen value geldi.

        System.out.println(kisiListesi.get(251535).get("ad"));

        // Maplerde index kavrami olmadigindan ITERATOR kullaniriz.

        System.out.println(kisiListesi);
        System.out.println("-----------------------------------------------------");

        for (Map.Entry<Integer, HashMap<String,String>> entry : kisiListesi.entrySet())
        {
            System.out.println("No = " + entry.getKey() + ", Kisi Listesi= " + entry.getValue()+" "+entry.getValue().get("soyad"));
            System.out.println(entry.getValue()); //{ad=Asli, soyad=Inal, bolum=English Teacher}
            System.out.println();
            System.out.println(entry.getKey()); // 251535
            System.out.println();
            System.out.println(entry.getValue().get("ad")); //Asli
        }


    }

}
