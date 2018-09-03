package entrust_observer_mode;

/**
 * Created on 2018/9/3 11:15
 * User: HC
 *  通知者的 抽象类
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:17 </br> </b>
     * <b> Description: 增加需要帮忙放哨的观察者        </br> </b>
     * @param object 要执行方法的对象
	 * @param  methodName 对象要执行的方法
	 * @param  args 要执行方法的参数
     * </br>
     * @return void
     *</pre>
     */
    public abstract void addListener(Object object, String methodName,Object ... args);

    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:20 </br> </b>
     * <b> Description: 告诉要通知的对象相应的内容        </br> </b>
     * @param
     * </br>
     * @return
     *</pre>
     */
    public abstract void notifyX();
}
