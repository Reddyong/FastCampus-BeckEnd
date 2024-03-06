package fc.java.course1.part2;

public class OverLoadingTest {
    public static void main(String[] args) {
        int result = add(4, 5);
        System.out.println("result = " + result);

        double dResult = add(4.5, 2.3);
        System.out.println("dResult = " + dResult);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
