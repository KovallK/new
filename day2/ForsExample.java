package pl.sda.javastart.day2;

public class ForsExample {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");
        }

        printFewNaturalNumbers(4);
        printNumbersWithoutDividableByParam(3);
        sumNaturalNumbersToLimit(1000);
    }

    public static void printFewNaturalNumbers(int endNumber) {
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);

        }


    }

    public static void printNumbersWithoutDividableByParam(int param) {

        System.out.println("parametr =" +param);
        for (int i = 0; i <= 10; i++) {
            if (i % param != 0) {
                System.out.println(i);

            }
        }

        for(int i = 0; i <= 10; i++){
            if(i%param==0){
                continue;//instrukcja continue pozwala ominąć jakąś iterrację i przejsc do kolejnej iterracji
            }
                System.out.println(i);

        }

    }
    public static void sumNaturalNumbersToLimit(int limit) {

        int sum = 0;
        for (int i = 0; ; i++) { //taka pętla działać może w nieskończoność,wszystko przez ; ;

            if (sum + i >= limit){ //zeby nie przekorczyc limitu piszemy +1

                break;
        }

        sum = i + sum;

        }
        System.out.println(sum);


    }

}
