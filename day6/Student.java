package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder {
    private Integer index;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer index, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.index = index;
        this.scholarship = scholarship;
    }

    @Override
    public String showMeYourName() {
        return getFirstName() + " " + super.getLastName();//sciagamy to z klasy wyzszej,ale mozna bez uzycia "super" lub z zucyiem super

    }

    @Override
    public BigDecimal showIncome() {//nadpisanie metody showincome,zeby podawal przychodz w Person ie
        return scholarship;
    }

    public void introductionInner() {
        super.intoduction();
        System.out.println("jestem też studentem");

    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }
}
