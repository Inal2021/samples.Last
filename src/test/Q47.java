package test;

public class Q47 {
    public static void main(String[] args) {

/*Ortadaki harfi alabileceğimiz bir program yazın. Eğer harf sayısı 2 nin katına eşitse,
    ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

    Examples

    ortadakiHarf("test")
    Çıktı : es
    ortadakiHarf("testing")
    Çıktı : t
    ortadakiHarf("middle")
    Çıktı : dd
    ortadakiHarf("A")
    Çıktı : A

* */

String kelime="A";

int ortaSayi=0;

if(kelime.length()%2==0) {
    ortaSayi=kelime.length()/2;
    System.out.println(kelime.charAt(kelime.length() / 2-1) + "" + kelime.charAt(kelime.length() / 2));
} else {
    ortaSayi=kelime.length()/2;
    System.out.println(kelime.charAt(kelime.length()/2));
}


    }
}
