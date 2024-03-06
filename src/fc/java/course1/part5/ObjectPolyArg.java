package fc.java.course1.part5;

import fc.java.course1.model.A;
import fc.java.course1.model.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        display(a);
        display(b);
    }

    private static void display(Object obj) {
        if (obj instanceof A) {
            ((A) obj).printGo();
        } else {
            ((B) obj).printGo();
        }
    }
}
