package fc.java.part2;

import java.util.Arrays;

public class CharTest {
    public static void main(String[] args) {
        char a = 'A';
        a += 32;

        int offset = 'A' - 'a';
        char[] lower = {'f', 'a', 's', 't', 'c', 'a', 'm'};
        char[] upper = new char[lower.length];

        for (int i = 0; i < lower.length; i++) {
            upper[i] = (char) (lower[i] + offset);
        }

        System.out.println("offset = " + offset);
        System.out.println("upper = " + Arrays.toString(upper));


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
