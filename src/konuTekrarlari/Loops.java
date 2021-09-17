package konuTekrarlari;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { //loop variable
            System.out.println("For mesaj"+i);
        }

        int i=0;
        while(i<10) {
            System.out.println("While Mesaj"+i);
            i++;
        }

        i=10;
        do {
            System.out.println("Do While Mesaj"+i);
            i++;
        } while (i<10);

    }
}
