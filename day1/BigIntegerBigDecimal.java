package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("466464664664");
        BigInteger newBI = new BigInteger("64664646464646464");

        System.out.println(bI.add(newBI));


        double x = 0.02;
        double y = 0.03; //chcemy odjac od siebie liczby zmiennoprzecinkowe

        double wynik;

        wynik = x-y;

        System.out.println(wynik);

        BigDecimal xx = new BigDecimal("0.02");
        BigDecimal yy = new BigDecimal("0.03");
        BigDecimal wynikwynik = xx.subtract(yy);

        System.out.println(wynikwynik);

        BigDecimal xxxx = BigDecimal.valueOf(x);
        BigDecimal yyyy = BigDecimal.valueOf(y);
        BigDecimal wynikwynikwynik = xxxx.subtract(yyyy);

        System.out.println(wynikwynikwynik);




    }

}
