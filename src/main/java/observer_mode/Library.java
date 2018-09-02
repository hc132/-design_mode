package observer_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/8/31 16:48
 * User: HC
 */
public class Library extends Observable {
    // 使用list 用于存放图书
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<Book>();
        //添加两本书

        Book android = new Book("Android", "里");
        Book hongLou = new Book("红楼", "曹");
        this.bookList.add(android);
        this.bookList.add(hongLou);
    }

    public void addBook(Book book) {
        this.bookList.add(book);
        super.notifyObserver(book);
    }

    public void delBook(Book book) {
        this.bookList.remove(book);
    }
}
