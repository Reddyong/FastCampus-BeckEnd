package fc.java.course2.model;

public class Person {
    private String name;
    private int age;
    private String email;
    private Address address;

    public Person() {
    }

    public Person(String name, int age, String email, Address address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
