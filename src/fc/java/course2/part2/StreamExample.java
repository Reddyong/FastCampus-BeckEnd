package fc.java.course2.part2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        Integer sumOfSquares = numbers.stream()
                .filter(isEven)
                .sorted()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("sumOfSquares = " + sumOfSquares);
    }
}
