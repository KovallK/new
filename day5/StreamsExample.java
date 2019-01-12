package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};

    public static void main(String[] args) {
        secondStream();
        firstStream();


    }
    private static void firstStream() {
    for (String animal : animals) {
            if (animal == null) {
                continue;

            }
            animal = animal.trim();//wycięcie białych znaków metoda trim w przypadku tablicy
            if (animal.length() >= 4) { //todo zrób unikalność
                System.out.println(animal);
            }
        }
        System.out.println("teraz stream");
        Arrays.stream(animals)//strumień Stringów
                .filter(e -> e != null)
                .map(e -> e.trim())//dla kazdego elementu wykonujemy obcięcie tzw. białych znaków,przerw,w przypadku kolekcji
                .filter(e -> e.length() >= 4)//każde "e" to obiekt typu String
                .distinct()//wyświetla niepowtarzalne,unique elementy z kolekcji(tablicy)
                .forEach(e -> System.out.println(e));
    }

    private static void secondStream() {
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            System.out.println(animal + ",");
        }
        System.out.println("# a teraz stream");
        String result = Arrays.stream(animals)
                .filter(a -> StringUtils.isNotBlank(a))
                .map(a->a.trim())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}