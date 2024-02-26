package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c = {'s', 'h', 'u', 't', 'd', 'o', 'w', 'n'};

        for (char c1 : c) {
            if (c1 == 'o') {
                break;
            }
            System.out.println("c1 = " + c1);
        }

        int count = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
