package konuTekrarlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> list =new ArrayList<Integer>(Arrays.asList(7,12,14,4,9,2,4,12,16));

        ilkDortEleman(list);
        System.out.println();

        ilkDortElemanAtlaYaz(list);
        System.out.println();

        ucElemanYazdir(list);



    }


    //1) Kücükten büyüge sirala sonra ilk 4 elemani yazdir;
    private static void ilkDortEleman(List<Integer> list) {
        list.stream().sorted().limit(4).forEach(LambdaMethodClass::boslukluYazdir);

    }

    //2) Kücükten büyüge sirala ilk 4 elemani atla
    private static void ilkDortElemanAtlaYaz(List<Integer> list) {
        list.stream().sorted().skip(4).forEach(LambdaMethodClass::boslukluYazdir);
    }

    //Kücükten büyüge sirali 4, 5 ve 6. elemanlari yazdir. //list [2 4 4 7 9 12 12 14 16]
    private static void ucElemanYazdir(List<Integer> list) {

        list.stream().sorted().skip(3).limit(3).forEach(LambdaMethodClass::boslukluYazdir);

    }



}
