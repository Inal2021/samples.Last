package test;

public class Q46 {

    public static void main(String[] args) {

       /* Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

        Örnekler:
        kontrolEt("abc", "bc") ➞ true
        kontrolEt("abc", "d") ➞ false
        kontrolEt("samurai", "zi") ➞ false
        kontrolEt("feminine", "nine") ➞ true
        kontrolEt("convention", "tio") ➞ false    */

        String x="MerveHocam";
        String y="SedefHocam";
        String z="Hocam";

        kontrolEt(x,y,z );

    }

    private static void kontrolEt(String x, String y, String z) {

        System.out.println(x.endsWith(y));
        System.out.println(x.endsWith(z));
    }
}
