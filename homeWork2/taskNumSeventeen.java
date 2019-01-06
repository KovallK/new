package pl.sda.javastart.homeWork2;

public class taskNumSeventeen {
    public static void main(String[] args) {
        numsNonDividableByThree(20);

    }

    public static void numsNonDividableByThree(int num) {
        int i = 1;
        while (i <= num) {
            if(i%3!=0)
            System.out.println(i);
            i++;


        }
    }
}
