package pl.sda.javastart.day8;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {

        ConstantHashCode const1 = new ConstantHashCode("1");
        ConstantHashCode const2 = new ConstantHashCode("1");
        ConstantHashCode const3 = new ConstantHashCode("1");
        ConstantHashCode const4 = new ConstantHashCode("1");
        ConstantHashCode const5 = new ConstantHashCode("1");

        RandomHashcode random1 = new RandomHashcode("2");
        RandomHashcode random2 = new RandomHashcode("2");
        RandomHashcode random3 = new RandomHashcode("2");
        RandomHashcode random4 = new RandomHashcode("2");
        RandomHashcode random5 = new RandomHashcode("2");


        Set<ConstantHashCode> constantHashCodeSet = new HashSet<>();
        constantHashCodeSet.add(const1);
        constantHashCodeSet.add(const2);
        constantHashCodeSet.add(const3);
        constantHashCodeSet.add(const4);
        constantHashCodeSet.add(const5);
        System.out.println(constantHashCodeSet.size());

        Set<RandomHashcode> randomHashcodes = new HashSet<>();
        randomHashcodes.add(random1);
        randomHashcodes.add(random2);
        randomHashcodes.add(random3);
        randomHashcodes.add(random4);
        randomHashcodes.add(random5);
        System.out.println(randomHashcodes.size());
        System.out.println(randomHashcodes.contains(random1));


    }
}

