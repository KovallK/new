package pl.sda.javastart.day2;

public class MethodsExample {
    public static void main(String[] args) {//tej metody,czyli main,szuka java uruchamiajac program

        int a = 3;
        int b = 4;
        int poleProstokąta = a * b;

        System.out.println("pole prostokąta = " + poleProstokąta);
        int result = rectangleArea(a, b);

        System.out.println("wynik metody drugiej = " + result);

        result = rectangleArea(5, 6);
        System.out.println("wynik z reużycia zmiennej result,pole prostokąta =" + result);
        System.out.println(rectangleArea(4, 6));//uzycie metody wewnatrz argumentow drugiej metody/korzystamy ze stworzonej juz metody na pole prostokąta
        System.out.println(rectangleCircuit(3, 5));
        System.out.println(inchToMeter(5.6));
        System.out.println(minutesToDateValue((24*60*365)));
        System.out.println(sumThreeDigitsOfNumber(234));
        System.out.println(bmi(82.5, 176));

    }

    public static int rectangleArea(int a, int b) {
        int result = a * b; //zmienna widoczna tylko wewnątrz metody (poza metodą main)
        return result;


    }

    public static int rectangleCircuit(int a, int b) {

        int result = 2 * a + 2 * b;
        return result;

    }

    public static double inchToMeter(double inches) {

        double result = inches * 0.0254;
        return result;


    }

    public static String minutesToDateValue(int minutes) { // todo

        int h = minutes / 60; // żeby zobaczyc ile jest pelnych godzin w np. 62 minutach
        int m = minutes % 60; //żeby zobaczyc ilość pozostałych minut 62/60 zostaje 1h i 02 min
        int d = minutes / (24 * 60); //ilość dni
        int y = minutes / (d / 365); //ilość lat

        return y + "y " + d + "d " + h + "h " + m + "m ";
    }

    public static int sumThreeDigitsOfNumber(int number) {

        int last = number % 10; //wszystko po to by uzyskac kaza cyfrę z osobna z 3 cyfrowej liczby np. 487,zeby dodac pozniej to jako 4+8+7
        int middle = number % 100 / 10;
        int first = number % 1000 / 100;

        int sum = last + middle + first;
        return sum;

    }

    public static double bmi(double weight, double height) {

        double result = weight / Math.pow(height, 2); // liczymy wspolczynnik BMi,czyli waga/wzrost podniesiony do potęgi 2
        return result;
    }
}
