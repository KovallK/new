package pl.sda.javastart.day6;

import java.math.BigDecimal;

public abstract class Person { //jezeli klasa stanie sie abstrakcyjna to nie da sie zrobic nowego obiektu typu Person
    private String firstName;
    private String lastName;
    private Integer identity;
    private Integer age; //dlaczego duzy Integer?bo ma domyslnie nulla,ktory ejst fajniejszy niz int,ktory ma domyslnie 0.

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }
    protected void intoduction(){
        System.out.println("jestem człowiekiem");
    }
    public abstract BigDecimal showIncome();//metoda z użyciem klasy abstrakcyjnej bo metoda niedokonczona,jej cialo znajduje sie w klasach potomnych

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
