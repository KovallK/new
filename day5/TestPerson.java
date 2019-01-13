package pl.sda.javastart.day5;

import java.util.Objects;

public class TestPerson {
    public static final int HEADS_QUANTITY = 1; //przypisanie wartości stałej
    private String surname;
    private String firstName;
    private int identity;
    static int counter;

    static {
        counter = 1;
    }

    {
        System.out.println("blok inicjalizujący");
        this.identity = counter++;     //blok inicjalizujący -zawsze przed konstruktorem!
    }

    public TestPerson() {

    }

    public TestPerson(String surname, String firstName, int identity) {
        this(surname, firstName);
        this.identity = identity;

    }

    public TestPerson(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdentity() {
        return identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPerson testPerson = (TestPerson) o;
        return identity == testPerson.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}
