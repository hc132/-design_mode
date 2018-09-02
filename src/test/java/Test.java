import observer_mode.*;

/**
 * Created on 2018/8/31 16:59
 * User: HC
 */
public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        Oberver readerA = new ReaderA();
        Oberver readerB = new ReaderB();

        //添加读者A
        library.addObserver(readerA);
        library.addObserver(readerB);

        Book book = new Book("朝花夕拾", "鲁迅");
        library.addBook(book);

    }
}
