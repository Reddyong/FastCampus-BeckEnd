package fc.java.course2.part2;

import fc.java.course2.model.Converter;
import fc.java.course2.model.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter = IntegerUtils::stringToInt;

        Integer result = converter.convert("123");
        System.out.println("result = " + result);
    }
}
