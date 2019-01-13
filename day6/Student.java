package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person {
    private Integer index;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer index, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.index = index;
        this.scholarship = scholarship;
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
