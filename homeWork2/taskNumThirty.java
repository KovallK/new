package pl.sda.javastart.homeWork2;

public class taskNumThirty {
    public static void main(String[] args) {
        System.out.println(ifFirstAndSecondEqualsThird(2, 1, 4));

    }

    public static boolean ifFirstAndSecondEqualsThird(int a, int b, int c) {
        int sum = a + b;
        if (sum == c) {

            return true;
        } else if (b + c == a) {
            return true;
        } else if (a + c == b) {
            return true;

        } else {
            return false;
        }
    }
}


