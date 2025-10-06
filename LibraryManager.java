import java.util.*;

public class LibraryManager {
    private Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBookById(int id) {
        return books.get(id);
    }

    public void updateBook(Book book) {
        books.put(book.getId(), book);
    }

    public void deleteBook(int id) {
        books.remove(id);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books.values());
    }
}