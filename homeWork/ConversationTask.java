package pl.sda.javastart;

import java.util.Scanner;

public class ConversationTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć,jak się czujesz ? ");

        String firstq = scanner.next();

        System.out.println("Ciesze się,że czujesz się " + firstq + ":)");
        System.out.println("Jak masz na imię? ");

        String name = scanner.next();

        System.out.println("Ile masz lat? ");

        int age = scanner.nextInt();

        System.out.println(name + ", masz " + age + " lata ");

        System.out.println("Ile masz wzrostu (dokładnie!)?");

        int height = scanner.nextInt();

        System.out.println(name + ", masz " + height + " cm wzrostu");

        System.out.println("A jak czujesz się teraz?");
        firstq = scanner.next();
        System.out.println("Ciesze się,że czujesz się " + firstq + ":)");

        /*System.out.println("A jak Ci się podoba Twoja nowa fryzura? ");

        String opinia = scanner.next();

        System.out.println("To super,że " + opinia);

        System.out.println("A ile dałaś? ");

        int price = scanner.nextInt() ;
        System.out.println(price +" zł " + "to nie dużo za taką fryzurę ");

        System.out.println("A co kupiłaś Mężowi do jedzenia? ");

        String food = scanner.next() + " " + scanner.next();

        System.out.println("Mąż dziękuje za " + food + ":)" + "Smacznego!");*/


    }

}
