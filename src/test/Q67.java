package test;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Q67 implements Serializable {
    public static void main(String[] args) {


        /*
          Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

    1. TreeSet: mavi,yesil,kirmizi,sari
    2. TreeSet: yesil,mavi,pembe,turuncu

    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil

    Karsilastirma Sonucu:
    no
    yes
    no
    yes
        * */

        TreeSet<String> list1=new TreeSet<String>();
        list1.add("kirmizi");
        list1.add("mavi");
        list1.add("sari");
        list1.add("yesil");

        TreeSet<String> list2=new TreeSet<String>();
        list2.add("mavi");
        list2.add("pembe");
        list2.add("turuncu");
        list2.add("yesil");

     Iterator it1 = list1.iterator();
     Iterator it2 = list2.iterator();

     while (it1.hasNext() && it2.hasNext()) {
         System.out.println(it1.next().equals(it2.next()) ? "yes" : "no");
            }

        }













    }





