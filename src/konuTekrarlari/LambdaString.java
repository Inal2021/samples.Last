package konuTekrarlari;

import java.util.*;


public class LambdaString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));

        yazdirBuyuk(list);
        System.out.println();

        uzunlukYazdir(list);
        System.out.println();

        farkliSonHarfSirala(list);
        System.out.println();

        uzunlukSiralaIlkElement(list);
        System.out.println();

        yazdirAileBaslayan(list);
        System.out.println();

        aileBaslaIileBitir(list);
        System.out.println();

        siralabuyut(list);
        System.out.println();

        isimUzunlukSirala(list);
        System.out.println();

        karesiniAlSiralaSil(list);
        System.out.println();

        booleanUygulama(list);
        System.out.println();

        sondanIkinciSiralaIlkYazdir(list);
        System.out.println();

        uzunlukTersSiralaIlkYazdir(list);


    }

    //1) List elemanlarini büyük harflerler ile yazdiralim;
    private static void yazdirBuyuk(List<String> list) {
        list.stream().map(t->t.toUpperCase()).forEach(LambdaMethodClass::boslukluYazdir);

    }

    //2) elemanları uzunluklarına göre sırala ve yazdır
    private static void uzunlukYazdir(List<String> list) {
        list.stream().map(t->t.length()).forEach(LambdaMethodClass::boslukluYazdir);
    }

    //3) farklı elemanlarını son harflerine göre sıralayıp yazdır
    private static void farkliSonHarfSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(t->t.length()-1)).forEach(LambdaMethodClass::boslukluYazdir);
    }

    //4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun

    private static void uzunlukSiralaIlkElement(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(LambdaMethodClass::boslukluYazdir);

        }

        //5) Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun

    private static void yazdirAileBaslayan(List<String> list) {
        list.stream().filter(x -> x.startsWith("A")).forEach(LambdaMethodClass::boslukluYazdir);

        //veya

        list.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).forEach(LambdaMethodClass::boslukluYazdir);

    }

    // 6) Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
    private static void aileBaslaIileBitir(List<String> list) {
        list.stream().filter(x->x.startsWith("A")||x.endsWith("i")).map(String::toLowerCase).forEach(LambdaMethodClass::boslukluYazdir);
    }

    // 7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
    private static void siralabuyut(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).forEach(LambdaMethodClass::boslukluYazdir);
    }

    // 8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın

    private static void isimUzunlukSirala(List<String> list) {

        list.stream().sorted(Comparator.comparing(t-> t.length())).map(t->t+" : "+t.length()).forEach(LambdaMethodClass::boslukluYazdir);

    }

    //9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın

    private static void karesiniAlSiralaSil(List<String> list) {
    list.stream().distinct().map(t->t.length()*t.length()).filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(LambdaMethodClass::boslukluYazdir);

    }

    // 10) BOOLEAN;


    private static void booleanUygulama(List<String> list) {
        //Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
        boolean result1= list.stream().allMatch(t->t.length()<12);
        System.out.println("uzunluklar 12 den kücük mü? "+result1);
        System.out.println();

        //bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
        boolean result2= list.stream().noneMatch(t->t.startsWith("x"));
        System.out.println("x ile baslayan yok "+result2);
        System.out.println();

        //en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.
        boolean result3= list.stream().anyMatch(t->t.endsWith("R"));
        System.out.println("R ile biten var mi? "+result3);

    }

    //11)  elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır;

    private static void sondanIkinciSiralaIlkYazdir(List<String> list) {
        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 2))).findFirst());
    }

    //12) Elemanlari uzunluklarina göre tersten siralayip ilk elemani yazdir.

    private static void uzunlukTersSiralaIlkYazdir(List<String> list) {
        System.out.println(list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
        System.out.println();

        //13) Eleman 'A', 'a' ile başlıyor veya 'N', 'n' ile bitiyorsa o elemanı silin

        list.removeIf(t->t.toUpperCase().startsWith("A")||t.toUpperCase().endsWith("N"));
        System.out.println(list);

    }
















}
