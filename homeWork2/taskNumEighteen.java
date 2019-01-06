package pl.sda.javastart.homeWork2;

public class taskNumEighteen {
    public static void main(String[] args) {
        System.out.println(twelveFactorial(12));

    }

    public static long twelveFactorial(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {

            factorial = factorial * i;

            i++;

        }

        return factorial;
    }

}
