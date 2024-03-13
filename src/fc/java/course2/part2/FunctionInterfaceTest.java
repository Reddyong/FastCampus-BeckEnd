package fc.java.course2.part2;

import fc.java.course2.model.MathOperation;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
