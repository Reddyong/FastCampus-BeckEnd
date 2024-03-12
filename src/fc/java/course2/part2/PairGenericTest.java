package fc.java.course2.part2;

import fc.java.course2.model.Pair;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
