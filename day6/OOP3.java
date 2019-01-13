package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //Worker worker1 = new Worker();
        Worker worker = new Worker("Jan", "Kowalski", 1235, 55, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia", "Kowalska", 12567, 18, Integer.valueOf(5), BigDecimal.valueOf(1000));
        Pensioner pensioner = new Pensioner("Adam", "Nowak", 6565656, Integer.valueOf(75), BigDecimal.valueOf(1200));

        Person[] people = new Person[]{worker, student, pensioner}; //utworzenie tabicy obiektów klasy PErson
        Object[] objects = new Object[]{worker, student, pensioner}; //utworzenie tablicy obiektów klasy PErson

        List<Person> peoplelist = new ArrayList<>();//utworzenie listy zamiast tablicy
        peoplelist.add(worker);
        peoplelist.add(student);
        peoplelist.add(pensioner);//dodawanie obiektów do listy peoplelist

        printDataLegacyMode(worker, student, pensioner);
        printDataProperWay(peoplelist);

        List<NameHolder> nameHolders=new ArrayList<>();
        nameHolders.add(worker);
        nameHolders.add(student);//dodajemy klasy,ktore posiadaja interfejs NameHolder do listy obiektów posiadajacych intrfejs NameHolder
        printNames(nameHolders);

    }
private static void printNames(List<NameHolder>nameHolders){
        for(NameHolder nameHolder:nameHolders){
            System.out.println(nameHolder.showMeYourName());//wyswietlenie imion z obiektow bedacych na liscie nameholderów
        }
}

    private static void printDataLegacyMode(Worker worker, Student student, Pensioner pensioner) {
        System.out.println(worker.showIncome());
        System.out.println(student.showIncome());
        System.out.println(pensioner.showIncome());
        worker.introductionInner();
        student.introductionInner();
        pensioner.introductionInner();
    }

    private static void printDataProperWay(List<Person> people) { //tworzymy liste personów
        for (Person person : people) {//przez użycie "iter"
            System.out.println(person.showIncome());
            if (person instanceof Worker) {//sprawdzamy czy person jest też klasy Worker ,uzywamy do tego sprawdzenia "inastanceof"
                ((Worker) person).introductionInner(); //dokonujemy rzutowania i kompilator wie,ze obiekt jest typu Worker
            } else if (person instanceof Student) { //rzutujac upewniamy sie czy np. Student/Pensioner/Worker sa klasy person
                ((Student) person).introductionInner();
            } else {
                ((Pensioner) person).introductionInner();

            }

        }

    }

}
