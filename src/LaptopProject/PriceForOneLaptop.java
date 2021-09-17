package LaptopProject;

import java.util.ArrayList;

public class PriceForOneLaptop {
/*
    Parametresi int ve return tipi int olan GetPrice methodu veriliyor.
    Bu method, Data class dan AllData methodunu çağırıyor. LaptopID parametredir
    Bu yöntemin Calculation class taki tüm methodları çağırması ve price
            alması ve totalAmount return etmesi gerekir.
            */

    public static int GetPrice(int LaptopId) {
        Data bilgi=new Data();
        ArrayList<String> urunOzlk= (ArrayList<String>) bilgi.AllData(LaptopId);
        int totalAmount= Calculation.getRam(urunOzlk)+Calculation.getCPU(urunOzlk)+
                Calculation.getcolor(urunOzlk)+Calculation.getSize(urunOzlk);

        return totalAmount;
    } }

	/*
    Parameter iki tane int (amount , discount) ve return tipi int olan
     getDiscount methodu veriliyor.
    Miktardan(amount)  indirim(discount) yapın
    indirilmiş fiyatı return edin
    Örnek
    Amount 100
    discount 20
    20% indirimden sonra
   Sonuç 80 olmalı
 */
/*
    public static int getDiscount(int amount, int discount) {
        return amount-((amount*discount)/100);
    }

    public int getPrice(int LaptopID) {
        Data data = new Data();
        ArrayList<String> arrayList=data.AllData(int laptopID);
        int totalPrice = Calculation.getcolor(arrayList) + Calculation.getRam(arrayList)+Calculation.getCPU(arrayList)+Calculation.getSize(arrayList);
        return 0;
    }
}
*/