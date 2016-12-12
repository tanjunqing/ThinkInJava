package Thread.InterruptTest;

/**
 * Created by Tan on 2016-12-11.
 */
public class InterruptMain {

    public static void main(String... args) {
        Thread thread = new Thread(new InterruptTest());
        try {
            thread.start();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
