package pl.sda.javastart.homeWork;

public class TaskNumSeven {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        printCubesOfNumbers(10);
        countDown(12);
        countDown(-2);
        countDown(10);
        printMultiplications(5);
    }

    public static void printCubesOfNumbers(int max) {
        for (int i = 1; i < max; i++) {
            System.out.println((int) Math.pow(i, 3));
        }
    }

    public static void countDown(int start) {
        System.out.println("Parametr= " +start);
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void printMultiplications(int num) {
        int i = 0;
        do {
            System.out.println(num * i);
            i++;
        }
        while (i <= num);
    }
}












