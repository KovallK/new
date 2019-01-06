package pl.sda.javastart.homeWork2;

public class taskNumFifteen {
    public static void main(String[] args) {
       numsFromRightToLeft(10);

    }

    public static void numsFromRightToLeft(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(i+1);

            }
            System.out.println();
        }
    }
}
