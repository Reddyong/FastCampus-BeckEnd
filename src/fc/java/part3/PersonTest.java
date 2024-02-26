package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Hong", 27, "010-1234-5678");

        String name = person.getName();
        int age = person.getAge();
        String phoneNumber = person.getPhoneNumber();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("phoneNumber = " + phoneNumber);

        person.play();
        person.eat();
        person.walk();
    }
}
