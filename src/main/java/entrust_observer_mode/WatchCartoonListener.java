package entrust_observer_mode;

import java.util.Date;

/**
 * Created on 2018/9/3 11:34
 * User: HC
 */
public class WatchCartoonListener {
    public WatchCartoonListener() {
        System.out.println(String.format("WatchCartoonListener  我正在看漫画，开始时间是 %1$tF %1$tT" ,new Date()));
    }

    public void stopWatchingCattoon(Date date) {
        System.out.println(String.format("WatchCartoonListener 老师来了不要看漫画了 老师回来时间 %1$tF %1$tT",date));
    }
}
