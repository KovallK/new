package pl.sda.javastart.homeWork;

import java.util.Scanner;

public class TaskNumEight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testResult;
        System.out.println("Podaj liczbę punktów ");
        testResult = scanner.nextInt();
        int ocena = 1;

        if (testResult < 0 || testResult > 100) {
            System.out.println("Podaj prawidłową ilość punktów z zakresu 0 do 100");
        }
        if (testResult > 0 && testResult < 50) {
            System.out.println("Niestety oblałeś egzamin,zdobyłeś " + testResult + "pkt,Twoja ocena to: " + ocena);

        }
        ocena++;
        if (testResult > 50 && testResult < 60) {
            System.out.println("Gratulacje,zdałeś,zdobyłeś " + testResult + "pkt,Twoja ocena to: " + ocena);

        }
        ocena++;
        if (testResult > 60 && testResult < 70) {
            System.out.println("Gratulacje,zdałeś,zdobyłeś " + testResult + " pkt,Twoja ocena to: " + ocena);

        }
        ocena++;
        if (testResult > 70 && testResult < 80) {
            System.out.println("Gratulacje,zdałeś,zdobyłeś " + testResult + " pkt,Twoja ocena to: " + ocena);
        }
        ocena++;

        if (testResult > 80 && testResult < 90) {
            System.out.println("Gratulacje,zdałeś,zdobyłeś " + testResult + " pkt,Twoja ocena to: " + ocena);
        }
        ocena++;
        if (testResult > 90 && testResult < 100) {
            System.out.println("Gratulacje,zdałeś,zdobyłeś " + testResult + " pkt,Twoja ocena to: " + ocena);

        }
    }
}

/*

drgi sposob na obliczenie tego z uzyciem metod:



public static String testResult(int pts){
if(pts <50){
return"1";
}
else{
return calculateResultWhenExamIsPassed(pts);


}
}
public static String calculateResultWhenExamIsPassed(int pts){
if(pts<60){
return"2";}

else if (pts<70{
return"3";}
else if (pts<80{
return"4";}
else if (pts<90{
return"5";}
return 6;

}

 */