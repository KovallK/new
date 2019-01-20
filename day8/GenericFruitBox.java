package pl.sda.javastart.day8;

public class GenericFruitBox<T extends Fruit> { //wpisane T bo nie okresalmy typu jaki bedzimey rpzechowywac,pudelko do przechowywania roznych owocow,np. apple,orange itp
    private T fruit;                          //T extends Fruit sprawia,ze mozmey wpisac w lisce kazdego fruita,ale nie np. Stringa,czy Longa,Czy Integera

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
