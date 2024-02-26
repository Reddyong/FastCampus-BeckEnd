package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int add = sum(1, 5);

        System.out.println("add = " + add);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
