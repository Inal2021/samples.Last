package test;

import java.util.TreeSet;

public class Q65 {
    public static void main(String[] args) {



/*
 65) Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk elemen: kirmizi
    son eleman: yesil
*
* */

    TreeSet<String> tree=new TreeSet<String>();
	    tree.add("yesil");
		tree.add("turuncu");
		tree.add("sari");
		tree.add("mavi");
		tree.add("kirmizi");

        System.out.println(tree);

        System.out.println("ilk eleman: "+tree.first()+" son eleman: "+tree.last());

}
}