package observer_mode;

/**
 * Created on 2018/8/31 16:56
 * User: HC
 */
public class ReaderB implements Oberver {


    public ReaderB() {
    }

    public void update(Object o) {
        System.out.println(String.format("我是读者B，我收到了%s",o));
    }



}
