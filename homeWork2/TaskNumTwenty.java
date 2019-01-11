package pl.sda.javastart.homeWork2;

import java.util.Scanner;

public class TaskNumTwenty {
    public static void main(String[] args) {

        Scanner switchWelcome = new Scanner(System.in);

        System.out.println("Enter language code");

        switch (switchWelcome.nextLine()) {
            case "PL":
                System.out.println("Dzień dobry.Witam serdecznie");
                break;
            case "EN":
                System.out.println("Goood morning. Welcome! ");
                break;
            case "DE":
                System.out.println("Guten morgen. Herzlich Willkommen! ");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue! ");
                break;
            default:
                System.out.println("Unknown language code.Goood morning. Welcome! ");

        }
    }
}
