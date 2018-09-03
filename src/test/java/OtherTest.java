import other_observer_mode.CartonObserver;
import other_observer_mode.ConcreteSubject;
import other_observer_mode.NBAObserver;

/**
 * Created on 2018/9/2 15:42
 * User: HC
 */
public class OtherTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CartonObserver cartonObserver = new CartonObserver();
        NBAObserver nbaObserver = new NBAObserver();
        concreteSubject.addObserver(cartonObserver);
        concreteSubject.addObserver(nbaObserver);
        System.out.println("所有监视已经添加！");
        concreteSubject.notifyAllObserver("老师来了");
    }
}
