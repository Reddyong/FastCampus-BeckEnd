public class WhileLoopTest {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.println("i = " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 11);
    }
}
