package pl.sda.javastart.homeWork2;

public class taskNumEleven {
    public static void main(String[] args) {
        evenOrNotEvenFor(20);
        evenOrNotEvenWhile(0);
        evenOrNotEvenDoWhile(0);
    }

    public static void evenOrNotEvenFor(int range) {
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0)
                System.out.println(i + " " + "liczba parzysta");
            else {
                System.out.println(i + " " + "liczba nieparzysta");
            }
        }

    }

    public static void evenOrNotEvenWhile(int start) {
        while (start < 20) {
            start++;
            if (start % 2 == 0) {
                System.out.println(start + " " + "liczba parzysta");
            } else {
                System.out.println(start + " " + "liczba nieparzysta");
            }
        }
    }

    public static void evenOrNotEvenDoWhile(int count) {
        do {
            count++;
            if (count % 2 == 0) {
                System.out.println(count + " " + "liczba parzysta");
            } else {
                System.out.println(count + " " + "liczba nieparzysta");
            }
        } while (count < 20);
    }
}



