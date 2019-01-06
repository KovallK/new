package pl.sda.javastart.homeWork;


import java.time.LocalDateTime;


public class TaskNumFour {

    public static void main(String[] args) {
        LocalDateTime localTime = LocalDateTime.now();

        int minute = localTime.getMinute();
        int hour = localTime.getHour();
        int year = localTime.getYear();
        int month = localTime.getMonthValue();
        int day = localTime.getDayOfMonth();
        String hourValue;
        if (hour < 10) {

            hourValue = "0" + hour;
        } else {
            // hourValue=""+hour; jedna z opcji,ale nieoficjalna zamiany int na stringa
            hourValue = Integer.toString(hour); // używamy tutaj klasy Integer bo ma ona opcję zamiany int na string przez.ToString()
        }

        String minuteValue = minute < 10 ? "0" + minute : "" + minute;


        System.out.println(hourValue + ":" + minuteValue + " " + day + "." + month + "." + year);


        int minutesPassed = hour * 60 + minute;

        System.out.println("ile minut minęło od północy = " + minutesPassed);

        int dayPercentPassed = minutesPassed * 100 / (24 * 60);

        System.out.format("ile procent doby minęło = " + dayPercentPassed + "\n");

        int secondsLeft = ((24 * 60 * 60) - (minutesPassed * 60));

        System.out.print("ile sekund pozostało do końca doby = " + secondsLeft);


    }

}



