package test;

import java.util.TreeSet;

public class Q66 {

   /*Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    Beklenen Çıktı:

    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    Tree eleman sayısı: 5
   * */

    public static void main(String[] args) {
        TreeSet<String> tree= new TreeSet<>();
        tree.add("yesil");
        tree.add("turuncu");
        tree.add("sari");
        tree.add("mavi");
        tree.add("kirmizi");

        System.out.println(tree.size()+" elemanli treeSet'in elemanlari sunlardir: "+tree);

    }

}
