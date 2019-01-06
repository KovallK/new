package pl.sda.javastart.day3;

public class WhileExample {

    public static void main(String[] args) {

        countDownWhile(100);
        countDownWhile(-1);
        countDownWhile(120);

        countDownDoWhile(-1);
        countDownWhile(50);

        fibonacci(6);
    }

    private static void fibonacci(int numOfElements) { //obliczanie ciągu fibonacciego

        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println(0);
        System.out.println(1);

        while (counter < numOfElements) {

            int sum = first + second;
            System.out.println(sum);

            counter++;

            first = second;
            second = sum;

        }

    }

    public static void countDownWhile(int start) {
        System.out.println("Parametr= " + start);
        while (start >= 0) {

            System.out.println(start);
            start--;

        }
    }

    public static void countDownDoWhile(int start) {
        if (start > 0) {
            System.out.println("nieprawidlowy parametr " + start);
            return;
        }

        do {
            System.out.println(start);
            start--;
        }
        while (start >= 0);

    }

}

