package fc.java.part4.poly;

import fc.java.part4.poly.model.Animal;
import fc.java.part4.poly.model.Cat;
import fc.java.part4.poly.model.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
    }
}
