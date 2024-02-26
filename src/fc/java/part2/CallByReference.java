public class CallByReference {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int result = add(a);

        System.out.println("result = " + result);
    }

    private static int add(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        return sum;
    }
}
