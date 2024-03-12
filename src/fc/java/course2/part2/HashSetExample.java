package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple");

        System.out.println("set.size() = " + set.size());

        System.out.println("set = " + set);

        set.remove("banana");

        boolean cherry = set.contains("banana");
        System.out.println("cherry = " + cherry);

        set.clear();

        boolean empty = set.isEmpty();
        System.out.println("empty = " + empty);
    }
}
