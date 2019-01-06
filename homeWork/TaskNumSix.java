package pl.sda.javastart.homeWork;

import java.math.BigDecimal;
import java.math.MathContext;

public class TaskNumSix {
    public static void main(String[] args) {
        System.out.println(stringToDouble("111"));
        System.out.println(ifItsNullEmpty("teścik"));


        BigDecimal num1 = new BigDecimal("1000.0");
        BigDecimal num2 = new BigDecimal("0.001");

        BigDecimal result = num1.subtract(num2);
        System.out.println(result);

        System.out.println(celsiusToFahrenheit(-20));
        System.out.println(fahrenheitToCelsius(100));
        System.out.println(kmhToMph(100));
        System.out.println(kmhToMps(100));
        System.out.println(minutesToFullQuarters(100));
        System.out.println(kgToLbs(100));
       // System.out.println(meterToinch(100));

        BigDecimal meters = new BigDecimal(100);
        BigDecimal inches = new BigDecimal(0.0254);

        BigDecimal mToInch = meters.divide(inches,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(mToInch);

        BigDecimal km = new BigDecimal(50);
        BigDecimal mach = new BigDecimal(0.00082);
        MathContext mc = new MathContext(1);

        BigDecimal kmToMach = km.multiply(mach,mc);
        System.out.println(kmToMach);



    }

    public static double stringToDouble(String text) {

        return Double.parseDouble(text);

    }

    public static boolean ifItsNullEmpty(String napis) {

        if (napis == null) {

            return true;

        }
        if (napis == "") {
            return true;

        } else {
            return false;

        }

    }

    public static int celsiusToFahrenheit(int celsius) {

        int fahrenheit = celsius * 9 / 5 + 32;

        return fahrenheit;


    }

    public static int fahrenheitToCelsius(int fahrenheit){


   int celsius = (fahrenheit-32)*5/9;
        return celsius;
    }

    public static int kmhToMph (int km){

        int mil = (int) (km/1.609344);

        return mil;
    }

    public static int kmhToMps (int km){

        int mps = (int) (km/3.6);

        return mps;


    }

    public static int minutesToFullQuarters (int minutes){

        int quarters = minutes / 15;

        return quarters;
    }

    public static double kgToLbs(double kg){

        double lbs = kg*2.204;

        return lbs;
    }





    }





