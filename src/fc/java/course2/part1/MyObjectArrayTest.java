package fc.java.course2.part1;

import fc.java.course1.model.A;
import fc.java.course1.model.B;
import fc.java.course2.model.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();

        list.add(new A());
        list.add(new B());

        A a = (A) list.get(0);
        B b = (B) list.get(1);

        a.display();
        b.printGo();

    }
}
