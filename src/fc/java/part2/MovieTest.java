package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("Avatar");
        movie.setOpenDate("2022.12.14");
        movie.setHero("Jake");
        movie.setGenre("Action");
        movie.setRunningTime(192);
        movie.setGrade("12years");

        System.out.println("movie = " + movie);
    }
}
