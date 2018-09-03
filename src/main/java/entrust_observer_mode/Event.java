package entrust_observer_mode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created on 2018/9/3 10:29
 * User: HC
 *
 * 事件对象的封装类
 */
public class Event {
    //要执行方法的对象
    private Object object;
    //要执行方法的名称
    private String methoName;
    //要执行的方法参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramsType;

    public Event(Object object, String methoName, Object... args) {
        this.object = object;
        this.methoName = methoName;
        this.params = args;
        contractParamTypes(this.params);
    }

    //根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params) {
        this.paramsType = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramsType[i] = params[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(this.getMethoName(), this.getParamsType());
        if (null == method) {
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethoName() {
        return methoName;
    }

    public void setMethoName(String methoName) {
        this.methoName = methoName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamsType() {
        return paramsType;
    }

    public void setParamsType(Class[] paramsType) {
        this.paramsType = paramsType;
    }
}
