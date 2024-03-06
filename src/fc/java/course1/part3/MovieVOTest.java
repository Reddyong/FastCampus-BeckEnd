package fc.java.course1.part3;

import fc.java.course1.model.MovieVO;

public class MovieVOTest {
    public static void main(String[] args) {
        MovieVO movieVO = new MovieVO("Avatar", 20221214, "Jake", "Action", 192, 12);

        System.out.println("movieVO = " + movieVO);
    }
}
