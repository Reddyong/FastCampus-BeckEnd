package fc.java.course1.part2;

public class VDATest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);
        int sum = 0;
        sum += 1;
        System.out.println("sum = " + sum);
        sum += 2;
        System.out.println("sum = " + sum);
        sum += 3;
        System.out.println("sum = " + sum);
        sum += 4;
        System.out.println("sum = " + sum);
        sum += 5;
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        int temp = 0;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
