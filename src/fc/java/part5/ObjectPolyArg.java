package fc.java.part5;

import fc.java.model.A;
import fc.java.model.B;

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
