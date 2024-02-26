package fc.java.part3;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("음식을 먹다.");
    }

    public void walk() {
        System.out.println("걷다.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
