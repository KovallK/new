package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person {//dzidziczenie z klasy Pers on
    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        super(firstName, lastName, identity, age);//konstruktor z nadklasy,czyli Pers on dopisujemy wtedy super i dopisujemy konstruktory,o ktore chcemy uzupelnic klasę poniżej
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
