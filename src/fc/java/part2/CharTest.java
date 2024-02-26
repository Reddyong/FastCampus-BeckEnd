package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char a = 'A';
        a += 32;

        System.out.println("a = " + a);

        int one = '1' - '0';
        int two = '2' - '0';

        int sum = one + two;

        System.out.println("sum = " + sum);

        int test = 0;
        for (char i = '1'; i <= '5'; i++) {
            test += (i - '0');
        }

        System.out.println("test = " + test);
    }
}
