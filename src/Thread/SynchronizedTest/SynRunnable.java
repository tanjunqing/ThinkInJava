package Thread.SynchronizedTest;

/**
 * Created by Tan on 2016-12-12.
 */
public class SynRunnable implements Runnable {
    SynTimer synTimer = new SynTimer();

    public void run() {
        synTimer.add(Thread.currentThread().getName());
    }
}
