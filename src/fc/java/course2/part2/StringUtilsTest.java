package fc.java.course2.part2;

import fc.java.course2.model.Converter;
import fc.java.course2.model.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> converter = stringUtils::reverse;

        String result = converter.convert("hello");
        System.out.println("result = " + result);
    }
}
