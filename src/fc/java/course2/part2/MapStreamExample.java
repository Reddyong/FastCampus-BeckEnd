package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("squaredNumbers = " + squaredNumbers);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");

        List<String> uppercaseWords = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("uppercaseWords = " + uppercaseWords);
    }
}
