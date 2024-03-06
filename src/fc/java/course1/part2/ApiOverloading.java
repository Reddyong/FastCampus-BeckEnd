package fc.java.course1.part2;

import java.util.Arrays;

public class ApiOverloading {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 6, 8, 3, 2}, {1, 5, 4, 2, 7}};

        Arrays.sort(a, (o1, o2) -> o1[0] - o2[1]);
    }
}
