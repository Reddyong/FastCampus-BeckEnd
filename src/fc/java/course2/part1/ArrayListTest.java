package fc.java.course2.part1;

import fc.java.course2.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>(1);

        list.add(new Book("Java", 15000, "hanbit", "Hong"));
        list.add(new Book("C++", 20000, "daerim", "Lee"));
        list.add(new Book("Python", 30000, "jungbo", "Kim"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
