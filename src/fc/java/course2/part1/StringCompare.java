package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

        String str3 = "apple";
        String str4 = "banana";

        int compare = str3.compareTo(str4);
        System.out.println("compare = " + compare);

        if (compare == 0) {
            System.out.println("same");
        } else if (compare < 0) {
            System.out.println("small");
        } else {
            System.out.println("big");
        }
    }
}
