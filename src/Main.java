import model.Book;
import repository.BookRepository;
import service.BookService;

public class Main {

    public static void main(String[] args) {

        BookService service = new BookService(new BookRepository());

        // CREATE
        Book book = new Book("Java OOP", "Oracle Press", "Learn OOP", 10, 1);
        service.addBook(book);


        // READ ALL
        service.getAllBooks().forEach(b ->
                System.out.println(b.getTitle())
        );


        // UPDATE
        Book existing = service.getBookById(1L);
        if (existing != null) {
            existing.setQuantity(50);
            service.updateBook(existing);
        }


        // DELETE
        service.deleteBook(6L);


    }
}
