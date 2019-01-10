package pl.sda.javastart.homeWork2;

public class taskThirtySix {
    public static void main(String[] args) {
        strongNumbers(5, 125);
    }
    public static void strongNumbers(int numberToThePower, int max) {

        while (numberToThePower < max) {
            int result = (int) Math.pow(numberToThePower, 2);
            if (result <= max) {
                System.out.println(result);
                numberToThePower++;
            }else{
                break;
            }
        }
    }
}
