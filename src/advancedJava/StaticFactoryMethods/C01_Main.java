package advancedJava.StaticFactoryMethods;

public class C01_Main {
    public static void main(String[] args) {

        C01_Auto car1 = new C01_Auto();
        C01_Auto car2 = new C01_Auto(car1.model, car1.marka);


        car1.ilanNo = 1001;
        car1.marka = "Mercedes";
        car1.model = "C-200";
        car1.yil = 2020;
        car1.fiyat = 18000;

        System.out.println("Incelemekte oldugunuz " + car1.ilanNo + " ilan no'lu arac, " + car1.marka + ", " + car1.model + ", " + car1.yil + " modeldir ve fiyati " + car1.fiyat + " Euro'dur.");

        car1.hiz(240);
        car1.yakit("Hybrit");


    }

}
