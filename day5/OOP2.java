package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        staticFinal();
        TestPerson testPerson1 =new TestPerson("Grażyna","Nowak");
        System.out.println(testPerson1.getIdentity());


    }
    private static void staticFinal() {
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        System.out.println(testPerson1.getIdentity());
        System.out.println(testPerson2.getIdentity());
        System.out.println("ludzi na świecie jest " + TestPerson.counter);
        CalculatorUtils utils = new CalculatorUtils();//przy tej metodzie niestatycznej trzeba tworzyc obiekt
        System.out.println(utils.add(5, 7));
        System.out.println(CalculatorUtils.adding(3, 4));//przy metodzie statycznej nie trzeba tworzyć nowego obiektu,wywolujemy ja z klasy
        testPerson1.setFirstName("Janek");
        ExperimentalObject object = new ExperimentalObject(1, 2, testPerson1);
        Integer mutableValue = object.getNotFinalImmutable();
        object.setNotFinalImmutable(6); //można ominąć final jeśli na zmiennej objest wywolamy metodę set i get
        TestPerson testPersonFromObject = object.getFinalMutable();
        testPersonFromObject.setFirstName("John"); //zmiana imienia z klasy TestPerson,ktora byla final,poprzez zejscie o poziom niżej i wywolanie get i set
    }

    private static void referenceExample() {
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
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        testPerson1.setFirstName("Anna");
        testPerson2.setFirstName("Anna");
        testPerson1.setSurname("Nowak");
        testPerson2.setSurname("Nowak");
        testPerson1.setIdentity(123);
        testPerson2.setIdentity(123);

        System.out.println(testPerson1 == testPerson2);
        System.out.println(testPerson1.equals(testPerson2));
        System.out.println(testPerson1.hashCode() == testPerson2.hashCode());

        TestPerson testPerson3 = new TestPerson("Anna", "Nowak", 82626);

    }


}

