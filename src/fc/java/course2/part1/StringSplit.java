package fc.java.course2.part1;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] split1 = str.split(",");
        System.out.println("split1 = " + Arrays.toString(split1));

        String str1 = "Hello World Java";
        String[] split2 = str1.split("\\s+");
        System.out.println("split2 = " + Arrays.toString(split2));
    }
}
