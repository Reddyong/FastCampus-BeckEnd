package fc.java.course1.part5;

import fc.java.course1.model.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();
        Object obj = new A();

        a.display();
        ((A) obj).display();
    }
}
