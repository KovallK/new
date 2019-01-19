package pl.sda.javastart.day7;

public class ExceptionsExample {
    public static void main(String[] args) {

        try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException x) {//x - to zmienna,ktora zawsze trza podac przy rodzaju exceptiona,nazwa dowolna
            System.out.println("Wystąpił wyjątek: " + x.getMessage());
        }
        System.out.println(divide(2, 2));

        try {
            divideWithException(2, 0);
        } catch (MyRuntimeException | ArithmeticException x) { //bo moga poleciec oba wyjatki,wiec sprawdzamy,czy nie poleci ktorys z tych dwóch
            System.out.println("Wystąpił wyjątek: " + x.getMessage());
        } finally {
            System.out.println("Blok finally");
        }
        try {
            divideWithCheckedException(2, 0);
        } catch (MyCheckException e) {
            e.printStackTrace();
        }

    }

    public static int divide(int a, int b) {
        return a / b;

    }

    public static int divideWithException(int a, int b) { //uzywane przy metodzie Unchecked
        if (b == 0) {
            throw new MyRuntimeException("Nie dziel cholero przez zero ! ");
        }
        return a / b;

    }

    public static int divideWithCheckedException(int a, int b) throws MyCheckException {//dopisujemy throws bo to metoda rzuca wyjatek,uzywane przy Checked Exceptions
        if (b == 0) {
            throw new MyCheckException("Nie dziel cholero przez zero ! ");
        }
        return a / b;

    }
}