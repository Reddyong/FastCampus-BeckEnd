package fc.java.part4;

import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();
        cat.night();
    }
}
