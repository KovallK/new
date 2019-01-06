package pl.sda.javastart.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(reversedArray(new int[]{1, 2, 3}));
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3})));
        getAndPrint(4);


    }

    public static int[] reversedArray(int[] tab) {
        int length = tab.length;
        int[] tabResult = new int[length];

        for (int i = length; i > 0; i--) {
            tabResult[length - i] = tab[i - 1];
        }

        return tabResult;
    }

    public static void getAndPrint(int howMany) {
        Scanner scanner = new Scanner(System.in);
        int[] tabForNumbers = new int[howMany];

        for (int i = 0; i < howMany; i++) {

            System.out.println("podaj liczbę" + i + ":");
            tabForNumbers[i]=scanner.nextInt();

        }
        int sum=0;
        double avg =0;
        for (int i = 0; i < howMany; i++){

            sum=tabForNumbers[i]+sum;

        }
        avg = sum/howMany;

        System.out.println("Twoja suma równa się: " +sum +"\n Twoja średnia równa się: "+avg);
        int[]tabForMinAndMax=ArraysExample.calculateMinAndMax(tabForNumbers);
        System.out.println("Minimalna wartość to: "+tabForMinAndMax[0]);
        System.out.println("Maksymalna wartość to: "+tabForMinAndMax[1]);


    }



}
