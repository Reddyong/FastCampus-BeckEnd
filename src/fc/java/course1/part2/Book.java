package fc.java.course1.part2;

class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;

    public Book() {
    }

    public Book(String title, int price, String company, String author, int page, String isbn) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
        this.page = page;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "fc.java.course1.part2.Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}
