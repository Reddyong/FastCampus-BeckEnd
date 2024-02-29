package fc.livelecture.java.test;

import fc.livelecture.java.domain.Dog;
import fc.livelecture.java.domain.Family;
import fc.livelecture.java.domain.Mom;

public class FamilyTest {
    public static void main(String[] args) {
        Family mom = new Mom("Seoul");
        Family dog = new Dog("Seoul");

        mom.introduce();
        dog.introduce();
        mom.move("Jeju");
        dog.move("Jeju");
        mom.introduce();
        dog.introduce();
    }
}
