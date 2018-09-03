package entrust_observer_mode;

import java.util.Date;

/**
 * Created on 2018/9/3 11:34
 * User: HC
 */
public class WatchingNBAListener {
    public WatchingNBAListener() {
        System.out.println(String.format("WatchingNBAListener  我正在看NBA，开始时间是 %1$tF %1$tT " ,new Date()));
    }

    public void stopWatchingTV(Date date) {
        System.out.println(String.format("WatchingNBAListener 老师来了不要看NBA了， 老师回来时间 %1$tF %1$tT",date));
    }
}
