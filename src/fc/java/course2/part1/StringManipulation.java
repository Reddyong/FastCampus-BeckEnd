package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "HelloWorld";

        char firstChar = str.charAt(0);
        String replacedString = str.replaceAll("o", "X");
        int index = str.indexOf("W");
        int length = str.length();
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        String substring = str.substring(5);
        int i = str.indexOf("oW");
        System.out.println("i = " + i);

        System.out.println("firstChar = " + firstChar);
        System.out.println("replacedString = " + replacedString);
        System.out.println("index = " + index);
        System.out.println("length = " + length);
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("substring = " + substring);
    }
}
