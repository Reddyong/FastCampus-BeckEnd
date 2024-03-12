package fc.java.course2.model;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String country;

    public Movie() {
    }

    public Movie(String title, String director, int year, String country) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
