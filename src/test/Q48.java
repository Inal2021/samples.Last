package test;

import java.util.Arrays;
import java.util.LinkedList;

public class Q48 {


    public static void main(String[] args) {

    //    İki farklı Array'i birleştiren bir program yazınız.

/*İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]

* */

        int[] arr1={2,6,7,8,9};
        int[] arr2={1,2,3,3,4,7,7,8};

        int[] yeni=new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length+arr2.length; i++) {
            if (i< arr1.length) {
                yeni[i]=arr1[i];
            } else {
                yeni[i]=arr2[i- arr1.length];
                            }

        }

        //Arrays.sort(yeni);
        System.out.println(Arrays.toString(yeni));


    }


}
