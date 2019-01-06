/*package pl.sda.javastart.homeWork;

public class FixedMinutesToDateMethod {

    public static void main(String[] args) {

        System.out.println(fixMinutesToDate(10000000));

    }

    public static String fixMinutesToDate( int min ){
        int h = min / 60; // żeby zobaczyc ile jest pelnych godzin w np. 62 minutach
        int m = min % 60; //żeby zobaczyc ilość pozostałych minut 62/60 zostaje 1h i 02 min
        double d = min / (24 * 60); //ilość dni
        double y = min / (d / 365); //ilość lat

        return y + "y " + d + "d " + h + "h " + m + "m ";

    }




}
*/