package other_observer_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/9/2 15:23
 * User: HC
 */
public class ConcreteSubject implements Subject {

    public List<Observer> mList = new ArrayList<>();

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 14:51 </br> </b>
     * <b> Description: 增加观察者         </br> </b>
     * @param observer
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void addObserver(Observer observer) {

        //确保相同的观察者只有一个
        if( null == observer ){
            throw new NullPointerException("null == observer");
        }

        if( !mList.contains(observer)){
            mList.add(observer);
        }
    }

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:05 </br> </b>
     * <b> Description: 移除指定观察者        </br> </b>
     * @param observer
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void removeObserver(Observer observer) {

        mList.remove(observer);
    }

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:06 </br> </b>
     * <b> Description:  通知所有观察者指定的消息      </br> </b>
     * @param data  要通知观察者的数据 因为Object 是所有类的父类，可以是用多态，当然也可以用泛型
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void notifyAllObserver(Object data) {
//        mList.clear();
        for (Observer observer : mList) {
            observer.update(this,data);
        }
    }

    /**
     * <pre>
     * <b> Author:  HuCheng Date 2018/9/2 15:09 </br> </b>
     * <b> Description:  单独通知某一个观察者       </br> </b>
     * @param observer 要通知观察者的数据 因为Object 是所有类的父类，可以是用多态，当然也可以用泛型
     * @param  data
     * </br>
     * @return void
     * </pre>
     */
    @Override
    public void notify(Observer observer, Object data) {

        if(null != null ){
            observer.update(this,data);
        }
    }
}
