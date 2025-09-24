// TODO: Implement this class to iterate over BookShelf
import java.util.Iterator;
import java.util.List;

public class BookShelfIterator implements Iterator<Book> {

    private final List<Book> books;
    private int index = 0;

    public BookShelfIterator(List<Book> books) {
        this.books = books;
    }

    public boolean hasNext() {
        return index < books.size();
    }

    public Book next() {
        return books.get(index ++);
    }
}
