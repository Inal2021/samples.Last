package test;

import java.util.Scanner;

public class KaffeeMaschine {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("*********Coffee Machine********");
        System.out.println("----Coffee on the table----");
        System.out.println("1.Turkish Coffee \n" + "2.Filter Coffee\n" + "3.Espresso");

        System.out.print("Which coffee would you like? (Please enter a code number) : ");
        int hangiKahve = scanner.nextInt();

        if (hangiKahve==1) {
            System.out.println("preparing a cup of Turkish Coffee...");
        } else if (hangiKahve==2) {
            System.out.println("preparing a cup of Filter Coffee...");
        } else if (hangiKahve==3) {
            System.out.println("preparing a cup of Espresso...");
        } else {
            System.out.println("You made an incorrect keystroke. Please try again....");
        }

        System.out.print("\nWould you like to add milk? (Please answer yes or no) : ");
        String sut = scanner.nextLine();

        if (sut.equalsIgnoreCase("yes")) {
            System.out.println("Milk adding...");
        } else if (sut.equalsIgnoreCase("no")) {
            System.out.println("Milk add not...");
        } else {
            System.out.println("You entered wrong data, please repeat the process...");
        }

        System.out.print("\nWould you like to add sugar? (yes or no) : ");
        String seker = scanner.nextLine();

        if (seker.equalsIgnoreCase("Yes")) {
            System.out.print("How many sugars do you want?: ");
            int kacSeker = scanner.nextInt();
            scanner.nextLine();
            System.out.println(kacSeker + " sugar adding...");
        } else if (seker.equalsIgnoreCase("No")) {
            System.out.println("sugar add not ");
        } else {
            System.out.println("You entered wrong data, please repeat the process...");
        }

        System.out.print("\nWhich size is best for you? (Large) Large - (M) Medium - (Lit) Little) : ");
        String boyut = scanner.nextLine();

        if (boyut.equalsIgnoreCase("Buyuk Boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor");
        } else if (boyut.equalsIgnoreCase("Orta Boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor");
        } else if (boyut.equalsIgnoreCase("Kucuk Boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor");
        } else {
            System.out.println("Hatalı gırıs yaptınız. Tekrar deneyiniz...");
        }


        System.out.println("\n" + hangiKahve + " " + boyut + " hazirdir.Afiyet olsun !!!");


    }

}
