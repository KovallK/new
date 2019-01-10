package pl.sda.javastart.homeWork2;

public class taskNumThirtyFive {
    public static void main(String[] args) {
        multiplicationTable(0);

    }

    public static void multiplicationTable(int sizeParam) {
        if (sizeParam > 10 || sizeParam < 1) {
            System.out.println("wrong number!please enter a number from 1 to 10");
        } else {
            for (int i = 1; i <= sizeParam; i++) {
                for (int j = 0; j <= sizeParam - 1; j++) {

                    System.out.print(i + (i * j) + " \t");

                }
                System.out.println();

            }


        }
    }
}