package pl.sda.javastart.day8;

import pl.sda.javastart.day7.CollectionsExample;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomersExample {

    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public static void main(String[] args) {
        System.out.println(salariesMap());
    }

    public List<Customer> customers() {
        List<Customer> customers = new ArrayList<>();// 1 opcja co tu robimy?zamieniamy tablicę na listę przy uzicu iter,fora
        for (Customer customer : people) { //uzywamy iter zeby uzupelnic listę peopli obiektami customer
            customers.add(customer);//uzupelniamy listę cusotmerami
        }
        return customers;
    }

    public List<Customer> customerList() {
        return Arrays.stream(people)//przekazujemy tablice do streama
                .collect(Collectors.toList()); //szysbza zamiana tablicy na listę,przu uzyciu streama
    }

    public List<String> customerFirstNameLastName() {
        List<String> namesSurnames = new ArrayList<>();
        for (Customer customer : people) {
            namesSurnames.add(customer.getFirstName() + " " + customer.getLastName());

        }
        return namesSurnames;
    }

    public List<String> customerFirstNameLastNameStream() {
        return customers().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.toList());
    }

    public static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> customers = new HashMap<>();
        for (Customer customer : people) {
            if (customers.containsKey(customer.getSalary())) {
                List<String> innerList = customers.get(customer.getSalary());
                innerList.add(customer.getId() + " " + customer.getFirstName() + " " + customer.getLastName());
            } else {
                List<String> innerList = new ArrayList<>();//zasieg zmiennej tylko w tym bloku
                innerList.add(customer.getId() + " " + customer.getFirstName() + " " + customer.getLastName());
                customers.put(customer.getSalary(), innerList);

            }

        }

        return customers;

    }


}