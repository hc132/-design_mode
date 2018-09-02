package entrust_observer_mode;

/**
 * Created on 2018/9/2 15:19
 * User: HC
 */
public interface Observer {

    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:20 </br> </b>
     * <b> Description:         </br> </b>
     * @param subject 被观察者
     * @param data  被观察者传递给观察这的数据
     * </br>
     * @return void
     *</pre>
     */
    void update(Subject subject, Object data);
}
