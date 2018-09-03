package other_observer_mode;


/**
 * Created on 2018/9/2 14:50
 * User: HC
 */
public interface Subject {

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 14:51 </br> </b>
     * <b> Description: 增加观察者         </br> </b>
     * @param observer
     * </br>
     * @return void
     * </pre>
     */
    void addObserver(Observer observer);

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:05 </br> </b>
     * <b> Description: 移除指定观察者        </br> </b>
     * @param observer
     * </br>
     * @return void
     * </pre>
     */
    void removeObserver(Observer observer);
    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:06 </br> </b>
     * <b> Description:  通知所有观察者指定的消息      </br> </b>
     * @param data  要通知观察者的数据 因为Object 是所有类的父类，可以是用多态，当然也可以用泛型
     * </br>
     * @return void
     *</pre>
     */
    void notifyAllObserver(Object data);

    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:09 </br> </b>
     * <b> Description:  单独通知某一个观察者       </br> </b>
     * @param observer 要通知观察者的数据 因为Object 是所有类的父类，可以是用多态，当然也可以用泛型
     * @param  data
     * </br>
     * @return void
     *</pre>
     */
    void notify(Observer observer, Object data);


}
