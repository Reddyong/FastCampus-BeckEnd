package fc.java.course1.part2;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for (char c1 : c) {
//            char lowerCase = Character.toLowerCase(c1);
//            System.out.print(lowerCase);
            System.out.print((char) (c1 + 32));
        }
    }
}
