package pl.sda.javastart.homeWork2;

public class taskNumThirtyThree {
    public static void main(String[] args) {
        caughtSpeeding("good", 70);

    }

    public static void caughtSpeeding(String mood, int speed) {
        int trafficFine = 100;
        if (mood.equals("good")) {
            System.out.println("Kierowco,masz szczęscie bo mam dziś dobry humor,możemy ponegocjować mandacik ");
            speed = speed - 5;}
        if (speed >= 51 && speed <= 60){
                System.out.println("Twój mandat to " + trafficFine + " zł");}
            else if (speed >= 61 && speed <= 69) {
                System.out.println("Twój mandat to " + trafficFine * 2 + " zł");
            } else if (speed >= 70) {
                System.out.println("Twój mandat to " + trafficFine * 3 + " zł");
            } else
                System.out.println("jedziesz z przepisową prędkością,mandatu nie będzie");
        }
    }
