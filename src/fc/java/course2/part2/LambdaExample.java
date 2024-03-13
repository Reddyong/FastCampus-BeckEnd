package fc.java.course2.part2;

import fc.java.course2.model.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = ((x, y) -> x + y);
        MathOperation sub = ((x, y) -> x - y);
        MathOperation mul = ((x, y) -> x * y);
        MathOperation div = ((x, y) -> x / y);

        int addResult = add.operation(10, 20);
        int subResult = sub.operation(10, 20);
        int mulResult = mul.operation(10, 20);
        int divResult = div.operation(10, 20);

        System.out.println("addResult = " + addResult);
        System.out.println("subResult = " + subResult);
        System.out.println("mulResult = " + mulResult);
        System.out.println("divResult = " + divResult);
    }
}
