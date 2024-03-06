package fc.java.course1.part4.poly.model;

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
        dog.move();
        cat.move();
    }
}
