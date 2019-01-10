package pl.sda.javastart.homeWork2;

public class taskNumTwentyNine {
    public static void main(String[] args) {
        System.out.println(ifBothEven(1,4));


    }

    public static boolean ifBothEven(int a, int b) {

        if (a % 2 == 0 && b % 2 == 0){
            return true;
        }else {
            return false;
        }

    }
}
