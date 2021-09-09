package ProjectQuestion_Nilufer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListOfMap {
    public static void main(String[] args) {
        //MAP lerde bir Key'e karsilik birden fazla value olabilir mi?
        /* meyveler --> elma, armut, cilek
            sebzeler --> kabak, patlican, marul, ispanak
            vitaminler --> A, B, C ve D vitaminleri
        */

        HashMap<String, List<String>> karisik=new HashMap<>();

      /*  List<String> meyveler=new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("cilek");
        System.out.println(meyveler); */

        List<String> meyveler= Arrays.asList("elma","armut","cilek");
        karisik.put("meyveler",meyveler );

        List<String> sebzeler= Arrays.asList("kabak","patlican","marul","ispanak");
        karisik.put("sebzeler",sebzeler );

        List<String> vitaminler= Arrays.asList("a","b","c","d");
        karisik.put("vitaminler",vitaminler );

        System.out.println(karisik);
        System.out.println(karisik.get("sebzeler").get(2)); //marul




    }
}
