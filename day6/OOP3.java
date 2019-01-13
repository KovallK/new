package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class OOP3 {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //Worker worker1 = new Worker();
        Worker worker = new Worker("Jan", "Kowalski", 1235, 55, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia", "Kowalska", 12567, 18, Integer.valueOf(5), BigDecimal.valueOf(1000));
        Pensioner pensioner = new Pensioner("Adam", "Nowak", 6565656, Integer.valueOf(75), BigDecimal.valueOf(1200));


    }
}
