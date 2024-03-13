package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        Collections.sort(names, String::compareTo);
        System.out.println("names = " + names);
    }
}
