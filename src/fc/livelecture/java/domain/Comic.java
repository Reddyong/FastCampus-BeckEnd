package fc.livelecture.java.domain;

public class Comic extends Book {
    protected String genre;

    public void printInfo() {
        System.out.println("title is " + title + " page number is " + page + " genre is " + genre);
    }

    public Comic(String title, int page) {
        super(title, page);
    }

    public Comic(String title, int page, String genre) {
        super(title, page);
        this.genre = genre;
    }
}
