package fc.livelecture.java.day08;

import fc.livelecture.java.day08.domain.Animal;
import fc.livelecture.java.day08.domain.Chicken;
import fc.livelecture.java.day08.domain.Cow;
import fc.livelecture.java.day08.domain.Farm;

public class ex02 {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        Animal cow = new Cow();

        chicken.cry();
        cow.cry();

        Farm farm = new Farm();

        farm.sound(chicken);
    }
}
