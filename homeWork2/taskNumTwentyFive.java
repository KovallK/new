package pl.sda.javastart.homeWork2;

public class taskNumTwentyFive {

    public static void main(String[] args) {
       christmasTree(9);

    }

    public static void christmasTree(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
        }



