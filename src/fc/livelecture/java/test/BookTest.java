package fc.livelecture.java.test;

import fc.livelecture.java.domain.Comic;
import fc.livelecture.java.domain.Novel;

public class BookTest {
    public static void main(String[] args) {
        Novel harryPotter = new Novel("Harry Potter", 567);
        Comic spyderMan = new Comic("Spyder Man", 123, "Fantasy");

        harryPotter.printInfo();
        spyderMan.printInfo();
    }
}
