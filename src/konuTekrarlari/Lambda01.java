package konuTekrarlari;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Lambda01 {

    /*  1) Lambda en fazla Collection ve Arraylerde kullanilir.
        2) t-> t%2==0 ===>>> LAMBDA EXPRESSION
        3) filter()   ===>>> filtrelemeye yarayan metoddur.
        4) map()      ===>>>  degisiklikler yapmaya yarayan metoddur.
        5) distinc()  ===>>>  tekrarlanan elemanlari siler
        6) foreach()  ===>>>  yazdirma bitimini belirtir. Terminal bitis elemani
        7) reduce()   ===>>>  coklu elemani bir elemana dönüstürmek icin kullanilir. Kullanimi; reduce(0, (t,u)->x+y) seklindedir.
                              buradaki 0 basalangic degeridir. Toplam icin 0, carpim icin 1 elemanini tercih ederiz. (t,u) kullanacagimiz,
                              atama yaqpacagimiz elemanlardir.
        8) sorted()   ===>>> list'i natural ordera göre siralar.
        9) sorted(Comparator.reverseOrder()) ===>>> Büyükten kücüge siralamak istersek, Comparator clasindan reverseOrder cagiririrz.
        10) sorted(Comparator.comparing(t-> t.length())) ==>>> elemanlari kendi istedigimiz bir özel duruma göre siralamak istersek kullaniriz.
        11) method classlarini java kodlariyla istedigimiz gibi kullanabiliriz.
            Method syntax  ==>>>  ClassName :: methodName   seklinde yazilir.
            Math Classi kullanimi ==>>> Math::addExact  veya Math:: multyplyExact  gibi
        12) collect(Collectort.toList()) ==>>> bir ifadeyi liste cevirmek (Integer yaparak return da da kullanabiliriz.)
        13) limit() ==>>> icine yazdigimiz deger kadar eleman getirir. fakat bastan baslar. Bastan ilk dört eleman dersek; 1,2,3,4. elemanlari getirir.
        14) skip() ==>>> icine koydugumuz deger kadr eleman atlar ve digerlerini getirir. skip(4) yazarsak ilk dördü atlar ve 5,6,7... getirir.


            * */

        public static void main(String[] args) {

                List<Integer> list = new ArrayList<>(Arrays.asList(5,7,19,11,23,53,8,42,11,7));

                yazdirma(list);
                System.out.println();

                ciftSayiYazdirma(list);
                System.out.println();

                tekSayiKare(list);
                System.out.println();

                farkliTekSayiKup(list); //Tekrarli sayilari silip, kalan tek sayilarin küpleri
                System.out.println();

                ciftSayiKareToplam(list);
                System.out.println();

                kuplerinCarpimi(list);
                System.out.println();

                siralaTersYazdir(list);



        }

        private static void yazdirma(List<Integer> list) {
                list.stream().forEach(t-> System.out.print(t+" "));

        }

        private static void ciftSayiYazdirma(List<Integer> list) {
                list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

        }

        private static void tekSayiKare(List<Integer> list) {
                list.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));

        }

        private static void farkliTekSayiKup(List<Integer> list) {
                list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

        }

        private static void ciftSayiKareToplam(List<Integer> list) {

                int num= list.stream().distinct().filter(t->t%2==0).map(t->t*t).map(t->t+t).reduce(0,(x,y)->x+y);
                System.out.print(num);

        }

//tekrarli elemanlari sil, cift sayilari bul, küplerini alarak topla;
        private static void kuplerinCarpimi(List<Integer> list) {

                int result= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (x,y)->x*y); //37933056

                System.out.println(result);

        }


        private static void siralaTersYazdir(List<Integer> list) {
                list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" ")); //53 42 23 19 11 11 8 7 7 5

        }















}



