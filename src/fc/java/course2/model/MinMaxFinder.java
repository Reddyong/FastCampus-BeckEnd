package fc.java.course2.model;

public class MinMaxFinder {

    private MinMaxFinder() {
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
