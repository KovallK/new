package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Long num1 = 127L;
        Long num2 = 127L;
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        Long num3 = 128L;
        Long num4 = 128L;
        System.out.println(num3 == num4);
        System.out.println(num3.equals(num4));


    }

    private static void equalsExample() {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setSurname("Nowak");
        person2.setSurname("Nowak");
        person1.setIdentity(123);
        person2.setIdentity(123);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
    }


}

