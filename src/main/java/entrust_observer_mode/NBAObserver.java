package entrust_observer_mode;

/**
 * Created on 2018/9/2 15:39
 * User: HC
 */
public class NBAObserver implements Observer {
    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:20 </br> </b>
     * <b> Description:         </br> </b>
     * @param subject 被观察者
     * @param data  被观察者传递给观察这的数据
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void update(Subject subject, Object data) {
        System.out.println(String.format(" 我是: %s, %s 别看NBA 了！", this.getClass().getSimpleName(),data));

    }
}
