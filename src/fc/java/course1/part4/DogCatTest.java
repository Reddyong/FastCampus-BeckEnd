package fc.java.course1.part4;

import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();
        cat.night();
    }
}
