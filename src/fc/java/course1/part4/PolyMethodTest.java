package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        display(dog);
        display(cat);
    }

    private static void display(Animal animal) {
        animal.eat();

        if (animal instanceof Cat) {
            ((Cat) animal).night();
        }
    }
}
