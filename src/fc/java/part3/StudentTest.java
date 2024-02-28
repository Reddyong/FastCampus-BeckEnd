package fc.java.part3;

import fc.java.model.Student;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Hong", "computer science", 37, "bitcocom@empas.com", 20230110, "010-1111-1111");

        System.out.println("student = " + student);

        Student[] students = new Student[4];

        students[0] = new Student("Hong", "computer", 33, "bit@empas.com", 20230110, "010-1111-1111");
        students[1] = new Student("Kim", "electric", 43, "bit@empas.com", 20230111, "010-1111-2222");
        students[2] = new Student("Lee", "struct", 23, "abc@ers.com", 20230112, "010-3333-2222");
        students[3] = new Student("Park", "transport", 33, "ddd@ddd.com", 20230115, "010-3333-6666");

        System.out.println("students = " + Arrays.toString(students));
    }
}
