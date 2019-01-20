package pl.sda.javastart.day8;

import java.math.BigDecimal;

public class Customer {


    private Integer id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final BigDecimal salary;
    private static Integer counter=1;

    {
        id=counter++;//przy kazdym utworzeniu nowego obiektu nada się kolejne id bo jest counter++//blok inicjalizujacy dziala rownolegle z tworzeniem nowego obiektu
        System.out.println("blok inicjalizujący"); //bloki inicjalizuącje powinny być zawsze nad konstruktorami
    }

    public Customer(String firstName, String lastName, Integer age, String salary) {
        //this.firstName = firstName;
        //this.lastName = lastName;
        //this.age = age;
        //this.salary = BigDecimal.valueOf(Integer.valueOf(salary));//String to BigDecimal
        this(firstName,lastName,age,Integer.valueOf(salary));
    }

    public Customer(String firstName, String lastName, Integer age, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary =BigDecimal.valueOf(salary);
        System.out.println("Konstruktor");

}

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static Integer getCounter() {
        return counter;
    }

    }