package entrust_observer_mode;

import java.lang.reflect.InvocationTargetException;

/**
 * Created on 2018/9/3 11:21
 * User: HC
 * 放哨的同学
 */
public class GoodNotifier extends Notifier{
    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:17 </br> </b>
     * <b> Description: 增加需要帮忙放哨的观察者        </br> </b>
     * @param object 要执行方法的对象
     * @param  methodName 对象要执行的方法
     * @param  args 要执行方法的参数
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人!");
        EventHandler eventHandler = this.getEventHandler();
        eventHandler.addEvent(object,methodName,args);
    }

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:20 </br> </b>
     * <b> Description: 告诉要通知的对象相应的内容        </br> </b>
     * @return
     * </pre>
     */
    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学： 老师来了");
        try {
            this.getEventHandler().notifyX();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
