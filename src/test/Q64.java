package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Q64 {
	public static void main(String[] args) {


		/* 64) Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
    Tersten Siralanisi:
    yesil
    turuncu
    sari
    mavi
    kirmizi
		* */

	TreeSet<String> tree=new TreeSet<String>();
	tree.add("yesil");
		tree.add("turuncu");
		tree.add("sari");
		tree.add("mavi");
		tree.add("kirmizi");

		System.out.println("mevcut liste: "+tree);
		Iterator x= tree.descendingIterator();

		while (x.hasNext()) {
			System.out.println("Ters cevrilmis: "+x.next());
		}





	}

	}






