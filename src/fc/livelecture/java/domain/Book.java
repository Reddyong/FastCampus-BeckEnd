package fc.livelecture.java.domain;

public class Book {
    protected String title;
    protected int page;

    public void printInfo() {
        System.out.println("title is " + title + " page number is " + page);
    }

    public Book() {
    }

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }
}
