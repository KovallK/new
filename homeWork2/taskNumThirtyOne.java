package pl.sda.javastart.homeWork2;

public class taskNumThirtyOne {
    public static void main(String[] args) {
        System.out.println(ifAnyBiggerThanZero(0,1));

    }

    public static boolean ifAnyBiggerThanZero(int a, int b) {
        if (a > 0 || b > 0) {
            return true;
        }
        return false;
    }
}
