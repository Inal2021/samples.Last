package ProjectQuestion_Nilufer;

import java.util.HashMap;

public class mapMethods {
    public static void main(String[] args) {

        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(101, "Ali Han");// eleman eklemek için kullanılır.
        hm1.put(102, "veli Can");
        hm1.put(103, "Ayşe Tan");
        hm1.put(101, "Kemal Yıldız"); // aynı key kullanıldığında eski kaydın üzerine yazar.
        System.out.println(hm1);

        hm1.put(104, "Hakan Baba"); //key ler uniqe dir ama value degisken olabilir.
        System.out.println(hm1);

        hm1.put(null,"Asli");
        System.out.println(hm1);

        hm1.put(null,"Süheyla");
        System.out.println(hm1);

        hm1.put(105, null);
        System.out.println(hm1);

        //Silme;
        hm1.remove(null);
        System.out.println(" null remove dan sonra"+hm1); //null remove dan sonra{101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=Hakan Baba, 105=null}

        // bir elemani cagirma;
        System.out.println(hm1.get(103)); //Ayse Tan
        System.out.println(hm1.values()); // [Süheyla, Kemal Yıldız, veli Can, Ayşe Tan, Hakan Baba, null]
        System.out.println(hm1.keySet()); // [null, 101, 102, 103, 104, 105]

        //Toplama;
        System.out.println(hm1.keySet().stream().reduce(0, (a, b) -> a + b)); // 515

        hm1.putIfAbsent(104, "kubilay");
        System.out.println(hm1); //{101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=Hakan Baba, 105=null}
        //belirtilen key ve value varoldugundan, ekleme yapmadi.

        HashMap<Integer, String> hm2=new HashMap<>();
        hm2.put(107, "elma");
        hm2.put(106,"armut");

        // putAll() ile sadece eklmeez, update de eder.
        hm1.putAll(hm2);
        System.out.println(hm1); //{101=Kemal Yıldız, 102=veli Can, 103=Ayşe Tan, 104=Hakan Baba, 105=null, 106=armut, 107=elma}

        //uzunluk bulma
        System.out.println("1. liste uzunlugu "+hm1.size()); //7
        System.out.println("2. liste uzunlugu "+hm2.size()); //2

        System.out.println(hm1.keySet().stream().filter(t-> t!=null).reduce(0, (a, b) -> a + b)); //728





    }



}
