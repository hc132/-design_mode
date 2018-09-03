import entrust_observer_mode.GoodNotifier;
import entrust_observer_mode.WatchCartoonListener;
import entrust_observer_mode.WatchingNBAListener;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created on 2018/9/3 11:25
 * User: HC
 */
public class EntrustTest {
    public static void main(String[] args) {
        //创建一个尽职尽责的放哨者
        GoodNotifier goodNotifier = new GoodNotifier();

        //创建一个玩游戏的同学，开始玩游戏
        WatchCartoonListener watchCartoonListener = new WatchCartoonListener();
        //创建一个看NBA的同学
        WatchingNBAListener watchingNBAListener = new WatchingNBAListener();
        //看漫画的同学告诉放哨的同学，老师来了告诉我一下
        goodNotifier.addListener(watchCartoonListener, "stopWatchingCattoon", new Date());
        //看NBA的同学告诉放哨的同学，老师来了告诉我一下
        goodNotifier.addListener(watchingNBAListener, "stopWatchingTV", new Date());

        try {
        System.out.println(String.format("放哨同学已就位 %1$tF %1$tT",new Date()));
            System.out.println("准备接口突击检查");
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 老师出现，放哨的人通知所有要帮忙的同学：老师来了
        goodNotifier.notifyX();

    }
}
