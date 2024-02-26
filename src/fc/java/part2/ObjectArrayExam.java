package fc.java.part2;

import java.util.Arrays;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        m[0] = new Movie("Avatar", "2022.12.31", "jake", "SF", 450, "12");
        m[1] = new Movie("Transformer", "2021.01.17", "Optimus", "SF", 350, "19");
        m[1] = new Movie("bye", "2023.05.24", "bo", "ss", 341, "24");

        System.out.println("m = " + Arrays.toString(m));
    }
}
