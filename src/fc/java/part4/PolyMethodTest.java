package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        display(dog);
        display(cat);
    }

    private static void display(Animal animal) {
        animal.eat();
    }
}
