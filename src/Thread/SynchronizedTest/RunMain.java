package Thread.SynchronizedTest;

/**
 * Created by Tan on 2016-12-12.
 */
public class RunMain {

    public static void main(String... args) {
        SynRunnable synRunnable = new SynRunnable();
        Thread thread1 = new Thread(synRunnable, "T1");
        Thread thread2 = new Thread(synRunnable, "T2");
        thread1.start();
        thread2.start();
    }
}
