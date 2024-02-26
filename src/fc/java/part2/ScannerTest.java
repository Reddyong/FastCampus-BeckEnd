import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        String title = scanner.next();
        int price = scanner.nextInt();
        String company = scanner.next();
        String author = scanner.next();
        int page = scanner.nextInt();
        String isbn = scanner.next();

        book.setTitle(title);
        book.setPrice(price);
        book.setCompany(company);
        book.setAuthor(author);
        book.setPage(page);
        book.setIsbn(isbn);

        System.out.println("book = " + book);

        scanner.close();
    }
}
