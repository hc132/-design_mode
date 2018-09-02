package observer_mode;

/**
 * Created on 2018/8/31 16:56
 * User: HC
 */
public class ReaderA implements Oberver {


    public ReaderA() {
    }

    public void update(Object o) {
        System.out.println(String.format("我是读者A，我收到了%s",o));
    }



}
