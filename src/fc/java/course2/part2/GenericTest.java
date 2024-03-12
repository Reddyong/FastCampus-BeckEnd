package fc.java.course2.part2;

import fc.java.course2.model.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArr<String> arr = new ObjectArr<>(5);
        arr.set(0, "Hello");
        arr.set(1, "World");
        arr.set(2, "Java");
        arr.set(3, "Generic");
        arr.set(4, "Example");

        System.out.println("arr = " + arr);
    }
}
