package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Pensioner extends Person {
    private BigDecimal pension;

    public Pensioner(String firstName, String lastName, Integer identity, Integer age, BigDecimal pension) {
        super(firstName, lastName, identity, age);
        this.pension = pension;
    }
    @Override
    public BigDecimal showIncome(){//nadpisanie metody showincome,zeby podawal przychodz w Person ie
        return pension;}

    public void introductionInner(){
        super.intoduction();
        System.out.println("jestem też emerytem");

    }

    public BigDecimal getPension() {//BigDecimale bo będziemy pisali kwoty,a to lepsze niz Iniger jest przy kwotach
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }
}
