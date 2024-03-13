package fc.java.course2.part2;

import fc.java.course2.model.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expression";

        System.out.println("To Upper Case : " + processString(input, toUpperCase));
        System.out.println("To Lower Case : " + processString(input, toLowerCase));

    }

    private static String processString(String input, StringOperation operation) {
        return operation.apply(input);
    }
}
