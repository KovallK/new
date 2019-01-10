package pl.sda.javastart.homeWork2;

public class taskNumThirtyTwo {
    public static void main(String[] args) {
        System.out.println(unlimitedInts(0, 2, 3, 4, 5, 6, 7, 8));
    }
    public static boolean unlimitedInts(int... args) {
        for (int i : args) {
            if (i >= 0) {
            }
            return true;
        }
        return false;
    }
}
