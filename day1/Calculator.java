package pl.sda.javastart.day1;

import java.util.Scanner;

public class Calculator {

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę");
        double secondValue = scanner.nextDouble();

        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a*b=" + (firstValue * secondValue));
        System.out.println("a/b=" + (firstValue / secondValue));
        System.out.println("wartość bezwględna z odejmowania a i b =" + Math.abs(firstValue - secondValue));
        System.out.println("wartość maksymalna wynosi" + Math.max(firstValue,secondValue));
        System.out.println("wartość minimalna wynosi" + Math.min(firstValue,secondValue));
        System.out.println("a^b = " +Math.pow(firstValue,secondValue)); //liczba a podniesiona do potęgi b






    }



}
