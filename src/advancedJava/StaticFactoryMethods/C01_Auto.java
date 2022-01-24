package advancedJava.StaticFactoryMethods;

import com.sun.tools.javac.Main;

public class C01_Auto extends C01_Main {

int ilanNo;
String marka;
String model;
int yil;
double fiyat;

    public C01_Auto() {}

    public C01_Auto(String model, String marka) {
this.model=model;
this.marka=marka;
    }

    public void hiz(int maxHiz) {
        System.out.println("Bu arac "+maxHiz+" km/s hiz yapar");
    }

    public void yakit(String yakitTuru) {
        System.out.println("bu aracin yakit türü "+yakitTuru+"'dir");
    }


}
