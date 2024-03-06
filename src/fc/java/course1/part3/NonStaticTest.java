package fc.java.course1.part3;

public class NonStaticTest {
    public static void main(String[] args) {
        NonStaticTest nonStaticTest = new NonStaticTest();
        int a = 10;
        int b = 20;
        int sum = nonStaticTest.hap(a, b);

        System.out.println("sum = " + sum);
    }

    private int hap(int a, int b) {
        return a + b;
    }
}
