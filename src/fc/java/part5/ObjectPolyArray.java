package fc.java.part5;

import fc.java.model.A;
import fc.java.model.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();

        display(obj);
    }

    private static void display(Object[] obj) {
        for (Object o : obj) {
            if (o instanceof A) {
                ((A) o).printGo();
            } else {
                ((B) o).printGo();
            }
        }
    }
}
