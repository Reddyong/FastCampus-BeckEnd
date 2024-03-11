package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld");
        String str2 = new String("HelloWorld");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        String str3 = "HelloWorld";
        String str4 = "HelloWorld";

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}
