package entrust_observer_mode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/9/3 10:51
 * User: HC
 * 事件的处理者
 */
public class EventHandler {
    //被通知的对象数组集合
    private List<Event> objects;

    public EventHandler() {

        this.objects = new ArrayList<>();
    }

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:05 </br> </b>
     * <b> Description:    添加某个对象要执行的事件，及需要的参数     </br> </b>
     * @param object 需要添加的对象
     * @param  methodName 需要执行的方法名
     * @param  args  需要执行的方法名参数
     * </br>
     * @return void
     * </pre>
     */
    public void addEvent(Object object, String methodName, Object... args) {
        objects.add(new Event(object, methodName, args));

    }
    /**<pre>
     * <b> Author:  HuCheng Date 2018/9/3 11:10 </br> </b>
     * <b> Description: 通知所有的对象执行指定的事件        </br> </b>
     * @param
     * </br>
     * @return void
     *</pre>
     */
    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event e : objects) {
                e.invoke();
        }
    }

}
