package observer_mode;

import java.util.Vector;

/**
 * Created on 2018/8/31 16:32
 * User: HC
 */
public abstract class Observable {

    // 定义一个观察者数组
    private Vector<Oberver> obVector = new Vector<Oberver>();

    // 添加一个观察者
    public void addObserver(Oberver oberver) {
        this.obVector.add(oberver);
    }
    //删除一个观察者

    public void removeObserver(Oberver oberver) {
        this.obVector.remove(oberver);
    }

    // 通知所有观察者

    public void notifyObserver(Book book) {
        for (Oberver oberver : obVector) {
            oberver.update(book);
        }
    }

}
