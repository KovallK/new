package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {

        printNumbersInTree(20);

    }

    public static void printNumbersInTree(int height){ //todo

        for(int i=0;i<height;i++){//odpowiada za ilośc wierszy
            for(int j=0;j<=i;j++){ //steruje ilością kolumn

                System.out.print(i+1);
            }
            System.out.println();
        }
    }

}
