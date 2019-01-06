package pl.sda.javastart.homeWork;

public class TaskNumFive {
    public static void main(String[] args) {

        System.out.println(mathEquation(1, 2, 3, 8));
        System.out.println(mathEquation(10, 11, 12, 1));
        System.out.println(mathEquation(8, 8, 8, 3));

    }

    public static int mathEquation(int a, int b, int c, int x) {
        int result = (int) (Math.pow(a, x) + Math.pow(b, x + 1) + Math.pow(c, x + 2));
        return result;
    }

}
