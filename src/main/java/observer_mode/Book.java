package observer_mode;

/**
 * Created on 2018/8/31 16:40
 * User: HC
 */
public class Book {
    // 书名
    public String bookName;
    // 作者
    public String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
