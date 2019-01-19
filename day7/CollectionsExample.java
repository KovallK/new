package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {
    public static final Student student1 = new Student("michał", "kowalski", 123, 40, 5, BigDecimal.valueOf(500));
    public static final Student student2 = new Student("janek", "kowalski ", 456, 41, 7, BigDecimal.valueOf(500));
    public static final Worker worker1 = new Worker("jozef", "nowak", 457, Integer.valueOf(9), BigDecimal.valueOf(700));
    public static final Pensioner pensioner1 = new Pensioner("halina", "nowak", 458, Integer.valueOf(8), BigDecimal.valueOf(1000));
    public static final Pensioner pensioner2 = new Pensioner("janina", "nowak", 458, Integer.valueOf(8), BigDecimal.valueOf(1000));

    public static void main(String[] args) {
        treeSetExample();//wyswietla wyniki posortowane
        listExample();
        hashSetExample();//wyswietla wyniki nieposortowane
        hashMapExample();//wyswietla mapę obiekotw-skraca to czas wyszukiwania jakiejs wartosci,bo szukamy wg unikalnego klucza

        namesStatisticsMap();

        List<Person> personList = populatePeopleList();
        personList.stream()
                .map(e->e.getLastName()==null?null:e.getLastName().trim()) //ternary operator
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));//grupowanie ludzi po nazwisku i zliczamy

    }

    private static void namesStatisticsMap() {
        List<Person> personList = populatePeopleList();
        Map<String, Integer> resultMap = new HashMap<>();
        for (Person x : personList) {
            String lastName;
            if(x.getLastName()==null){
                lastName=null;
            }else{
            lastName= x.getLastName().trim();
            }
            if (resultMap.containsKey(lastName)){
                int counter = resultMap.get(lastName); //sprawdzamy na liscie wg klucza ile jest osob o takim samym nazwisku.
                resultMap.replace(lastName, counter + 1);
            } else {
                resultMap.put(lastName, 1);
            }

        }
        System.out.println(resultMap);
    }

    private static void hashMapExample () {
            Map<Integer, Person> personMap = new HashMap<>();//tworzymy mapę obkektów klasy person
            personMap.put(student1.getIdentity(), student1); //to peirwsze w nawiasie to nasz klucz,drugie to wartosc,czyli obiekt student1
            personMap.put(student2.getIdentity(), student2); //to peirwsze w nawiasie to nasz klucz,drugie to wartosc,czyli obiekt student1
            personMap.put(worker1.getIdentity(), worker1); //to peirwsze w nawiasie to nasz klucz,drugie to wartosc,czyli obiekt student1
            personMap.put(pensioner1.getIdentity(), pensioner1); //to peirwsze w nawiasie to nasz klucz,drugie to wartosc,czyli obiekt student1
            personMap.put(pensioner2.getIdentity(), pensioner2); //to peirwsze w nawiasie to nasz klucz,drugie to wartosc,czyli obiekt student1

            System.out.println(personMap);
        }

        private static void hashSetExample () {
            // Set<Person> ofPersonsSet = new LinkedHashSet<>(); w tym przypadku zostanie zachowana kolejnosc dodawania elementów do listy
            Set<Person> ofPersonsSet = new HashSet<>();

            System.out.println(ofPersonsSet.add(student1)); //jesli metoda doda ten obiekt do listy to wartosc bedzie true,jeslinie doda to bedzie false
            System.out.println(ofPersonsSet.add(pensioner1)); //jesli metoda doda ten obiekt do listy to wartosc bedzie true,jeslinie doda to bedzie false
            System.out.println(ofPersonsSet.add(worker1)); //jesli metoda doda ten obiekt do listy to wartosc bedzie true,jeslinie doda to bedzie false
            System.out.println(ofPersonsSet.add(pensioner2)); //jesli metoda doda ten obiekt do listy to wartosc bedzie true,jeslinie doda to bedzie false
            System.out.println(ofPersonsSet.add(student2)); //jesli metoda doda ten obiekt do listy to wartosc bedzie true,jeslinie doda to bedzie false
            System.out.println(ofPersonsSet.size());
            System.out.println(ofPersonsSet);
        }

        private static void listExample () {
            List<Person> personList = populatePeopleList();


            System.out.println(personList.contains(pensioner1));
            personList.remove(pensioner1);
            System.out.println(personList.contains(pensioner1));
            System.out.println(personList);
        }

        private static List<Person> populatePeopleList () {
            List<Person> personList = new ArrayList<>();
            personList.add(student1);
            personList.add(student2);
            personList.add(worker1);
            personList.add(pensioner2);
            personList.add(pensioner1);
            return personList;
        }

        private static void treeSetExample () {
            Set<Person> tSet = new TreeSet<>();

            tSet.add(student1);
            tSet.add(student2);
            System.out.println(tSet.toString());

            for (Person x : tSet) {
                System.out.println(x.getFirstName());
            }

            tSet.stream()
                    .map(e -> e.getFirstName())
                    .forEach(e -> System.out.println(e)); //wyswietlanie samych imion obiektow Person
        }
    }
