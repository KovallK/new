package pl.sda.javastart.homeWork2;

public class taskNumSixteen {
    public static void main(String[] args) {

        fibonacci(10);

    }

    public static void fibonacci(int last) {
        int first = 0;
        int second = 1;
        int counter = 1;


        while (counter < last) {
            int sum = first + second;

            System.out.println(sum);
            counter++;
            first=second;
            second=sum;

        }

    }
}
