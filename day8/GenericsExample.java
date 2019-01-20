package pl.sda.javastart.day8;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        notGeneric();

        genericExample();

        GenericFruitBox<Apple> appleBox = new GenericFruitBox<>(new Apple());
        appleBox.getFruit().introduceYourself(); //wywolac mozmey wszystkie metody z fruita np.introduceYoutself,ale nie mozemynp.wywolac introduceOrange
        List<Number> numbers = Arrays.asList(5, 2, 10.7, 1.78); // uzyskujemy listę liczb dzieki wykorzystaniu Arrays.asList
        System.out.println(sumAnyNumbers(numbers));
        List<Long> longs = Arrays.asList(123L, 38L);
        System.out.println(sumAnySpecifiedNumbers(longs));
    }

    private static Double sumAnyNumbers(List<Number> numbers) {
        Double sum = 0d;
        for (Number number : numbers) {
            sum = sum + number.doubleValue(); //dodawanie elementów z listy liczb
        }
        return sum;
    }

    private static <T extends Number> double sumAnySpecifiedNumbers(List<T> numbers) {
        Double sum = 0d;
        for (T number : numbers) {
            sum = sum + number.doubleValue(); //dodawanie elementów z listy liczb
        }
        return sum;
    }


    private static void genericExample() {
        Apple apple = new Apple(); //tworzyny nowe pudełko generyczne przechowujące jabłka
        GenericFruitBox<Apple> genericFruitBox = new GenericFruitBox<>(apple);
        Apple fromBox = genericFruitBox.getFruit();
        fromBox.introduceApple(); //w tym rozwiązaniu nie musimy castować !! lepsze rozwiązanie
    }

    private static void notGeneric() {
        Fruit apple = new Apple();
        FruitBox fruitBox = new FruitBox(apple);
        Apple fromBox = (Apple) fruitBox.getFruit();//dokonujemy castowania poprzez wpisanie Apple w nawiasie,zbey uzyskac obiekt Fruit bardziejszczegolwoego typu,czyli Apple

        fromBox.introduceApple(); // bez castowania z uzyciem metody z Appla
    }
}
