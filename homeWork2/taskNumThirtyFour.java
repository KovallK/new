package pl.sda.javastart.homeWork2;

import java.util.Scanner;

public class taskNumThirtyFour {
    public static void main(String[] args) {

        Scanner calcifs = new Scanner(System.in);

        System.out.println("type first number ");
        double firstnum = calcifs.nextDouble();
        System.out.println("type second number ");
        double secnum = calcifs.nextDouble();

        System.out.println("type of action?");
        System.out.println("1-addition");
        System.out.println("2-substraction");
        System.out.println("3-division");
        System.out.println("4-mulitiplication");

        double action = calcifs.nextDouble();
        double result;

        if (action == 1) {
            result = firstnum + secnum;
            System.out.println(result);
        } else if (action == 2) {
            result = firstnum - secnum;
            System.out.println(result);
        } else if (action == 3) {
            result = firstnum / secnum;
            System.out.println(result);
        } else if (action == 4) {
            result = firstnum * secnum;
            System.out.println(result);
        } else
            System.out.println("wrong choice of action");

    }

}


