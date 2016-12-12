package Thread.SynchronizedTest;

/**
 * Created by Tan on 2016-12-12.
 */
public class SynTimer {

    private static int num = 0;

    public void add(String name) {
        synchronized (this) {
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
            System.out.println(name + ",您是第" + num + "个使用SynchronizedTimer的线程!");
        }
    }
}
