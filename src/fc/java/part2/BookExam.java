package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("java");
        book.setPrice(30000);
        book.setCompany("fastcampus");
        book.setAuthor("hong");
        book.setPage(700);
        book.setIsbn("338014");

        System.out.println("book = " + book);
    }
}
