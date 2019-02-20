package pl.sda.javastart.myOwnWork;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class ArrayVsLinkedListSpeed {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTiming("ArrayList", arrayList);
        doTiming("LinkedList", linkedList);

    }

    private static void doTiming(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = currentTimeMillis();
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i); //dodawanie elementu do początku listy jest znacznie dłuższe w Array niż w Linked List
            //list.add(list.size()-100,i)dodawanie elementu na końcu lub bliżej końca listy nie powoduje znacznej róznicy w czasie,a nawet Array szybsza!
        }

        long end = currentTimeMillis();
        System.out.println("Time taken to add: " + (end - start) + "ms for" + type);

    }
}
