package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder {//dzidziczenie z klasy Pers on
    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        super(firstName, lastName, identity, age);//konstruktor z nadklasy,czyli Pers on dopisujemy wtedy super i dopisujemy konstruktory,o ktore chcemy uzupelnic klasę poniżej
        this.salary = salary; //jesli tam powyzej nie napiszemy super (costam) za parametrami to w tym miejsu znajdzie się niewidoczny super ()bezparametrów


    }

    @Override
    public String showMeYourName() {
        return getFirstName() + " " + super.getLastName();//sciagamy to z klasy wyzszej,ale mozna bez uzycia "super" lub z zucyiem super

    }

    @Override
    public BigDecimal showIncome() {//nadpisanie metody showincome,zeby podawal przychodz w Person ie
        return salary;
    }

    public void introductionInner() {
        super.intoduction();
        System.out.println("jestem też pracownikiem");

    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
