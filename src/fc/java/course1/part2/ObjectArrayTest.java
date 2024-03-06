package fc.java.course1.part2;

import java.util.Arrays;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book("HarryPotter", 30000, "fc", "rollin", 300, "42626");
        b[1] = new Book("newInt", 50000, "fc", "triangle", 100, "351416");
        b[2] = new Book("extra", 40000, "fc", "rectangle", 500, "7425194");

        System.out.println("b = " + Arrays.toString(b));
    }
}
