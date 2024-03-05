package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
    }
}
