package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApiTest {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println("sum = " + sum);

        int[] array = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        System.out.println("array = " + Arrays.toString(array));

        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}
