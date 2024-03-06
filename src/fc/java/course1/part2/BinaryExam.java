package fc.java.course1.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int decimal = 123;

        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary = " + binary);
        String octal = Integer.toOctalString(decimal);
        System.out.println("octal = " + octal);
        String hex = Integer.toHexString(decimal);
        System.out.println("hex = " + hex);
    }
}
