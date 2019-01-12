package pl.sda.javastart.day5;

import java.util.Objects;

public class Person {
    private String surname;
    private String firstName;
    private int identity;
    static int counter=0;

    public Person() {
     this.identity=++counter;
    }

    public Person(String surname, String firstName, int identity) {
        this.surname = surname;
        this.firstName = firstName;
        this.identity = identity;

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
        Person person = (Person) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    public void setIdentity(int identity) {
        this.identity = identity;

    }
}
