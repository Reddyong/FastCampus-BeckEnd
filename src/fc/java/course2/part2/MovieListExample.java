package fc.java.course2.part2;

import fc.java.course2.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieListExample {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("괴물", "봉준호", 2006, "한국"));
        movieList.add(new Movie("기생충", "봉준호", 2019, "한국"));
        movieList.add(new Movie("완벽한 타인", "이재규", 2018, "한국"));

        System.out.println("movieList = " + movieList);
    }
}
