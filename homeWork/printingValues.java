package pl.sda.javastart.homeWork;

import java.util.Formatter;

public class printingValues {

    public static void main(String[] args) {
        int x = 100;
        double pi = Math.PI;
        float n = 5.2f;
        Formatter liczba = new Formatter();
        liczba.format("%.4f", n);

        Formatter liczba2=new Formatter();
        liczba2.format("%09.4f",n=2324435.25f);






        System.out.print("Printing simple integer: x = " + x +"\n");
        System.out.print("Formatted with precison: PI = ");
        System.out.format("%.2f%n",pi);
        System.out.print("Formatted to specific width: n = " + liczba);
        System.out.print("\n"+"Formatted to right margin: n = " + liczba2);




    }
}
