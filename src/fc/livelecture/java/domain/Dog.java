package fc.livelecture.java.domain;

public class Dog extends Family{
    public Dog() {
    }

    public Dog(String city) {
        super(city);
    }

    @Override
    public void introduce() {
        System.out.println("wall wall I live in " + this.city);
    }
}
