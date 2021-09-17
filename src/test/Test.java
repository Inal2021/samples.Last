package test;

import java.util.*;

class Test{

    public static void main(String args[]){
//1)
        String str="Java is easy";

        System.out.println(str.contains("is"));

        System.out.println(str.contains("and"));
//2) 1.yol
        String result = Optional.ofNullable(str)
                .filter(sStr -> sStr.length() != 0)
                .map(sStr -> sStr.substring(0, sStr.length() - 1))
                .orElse(str);

        System.out.println(result);
        //2. yol
        String x = null;
        if ((str != null) && (str.length() > 0)) {
            x = str.substring(0, str.length() - 1);
        }

        System.out.println(x);

//3)

        System.out.println(str.toUpperCase());

    }

    }



