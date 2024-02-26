package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        int x = 10;
        if (x > 0) {
            System.out.println("양수입니다");
        }

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 7 == 0) {
            System.out.println("7의배수");
        }

        System.out.println("end");

    }
}
