package pl.sda.javastart.homeWork2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class taskNumNineteen {
    public static void main(String[] args) {

        Scanner doWhileCalculator = new Scanner(System.in);


        System.out.println("podaj pierwszą liczbę ");
        int first = doWhileCalculator.nextInt();

        System.out.println("podaj drugą iczbę ");

        int second = doWhileCalculator.nextInt();

        System.out.println("podaj znak działania,które chcesz wykonać ");

        int result = 0;

        if (doWhileCalculator.next().charAt(0) == '+') {
            result = first + second;
            System.out.println("wynik dodawania liczb " + first + " i " + second + " to " + result);
        }
        if (doWhileCalculator.next().charAt(0) == '-') {
                result = first - second;
                System.out.println("wynik odejmowania liczb " + first + " i " + second + " to " + result);

            }
       if (doWhileCalculator.next().charAt(0) == '/') {
            result = first / second;
            System.out.println("wynik dzielenia liczb " + first + " i " + second + " to " + result);

        }

      /*char sign=doWhileCalculator.next().charAt(0);


      switch(sign)
      {
          case '+':
              result =first+second;
              System.out.println("wynik dodawania liczb "+first+" i "+second+" to "+result);
              break;
          case '-':
              result = first - second;
              System.out.println("wynik odejmowania liczb "+first+" i "+second +" to "+ result);
              break;

          case'/':
              result = first/second;
              System.out.println("wynik dzielenia liczby "+first+" przez "+second+" to "+result);
              break;
          case'*':
              result = first*second;
              System.out.println("wynik mnożenia liczb "+first+" i "+second+" to "+result);

          default:
              System.out.println("to koniec programu");
      }*/


    }

}





