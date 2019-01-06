package pl.sda.javastart.day4;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(prepareRandomArray(10)));

    }
    public static int[] prepareRandomArray(int howLong) {

        int[] tabForRandom = new int[howLong];

        Random random =new Random();
        for(int i=0;i<howLong;i++){
            tabForRandom[i]=random.nextInt();
        }
    return tabForRandom;
    }

}
