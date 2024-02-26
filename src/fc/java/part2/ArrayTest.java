import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        Arrays.fill(a, 10);
        System.out.println("a = " + Arrays.toString(a));

        int[] b = {10, 20, 30, 40, 50};

        System.out.println("b[0] + b[3] = " + (b[0] + b[3]));
        System.out.println("b.length = " + b.length);
    }
}
