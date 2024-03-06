package fc.java.part5;

import fc.java.model.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();
        Object obj = new A();

        a.display();
        ((A) obj).display();
    }
}
