package pl.sda.javastart.homeWork2;

public class taskNumThirteen {
    public static void main(String[] args) {
numbersToThePower(1,10);

    }
    public static void numbersToThePower(int first,int second){
        while (first < second) {

            int poweredNum = (int) Math.pow(first,2);
            System.out.println(poweredNum);

            first++;
     }


    }

}
