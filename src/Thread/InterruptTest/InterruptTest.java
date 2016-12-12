package Thread.InterruptTest;

import java.util.Date;

/**
 * Created by Tan on 2016-12-11.
 */
public class InterruptTest implements Runnable {


    @Override
    public void run() {
        while (true) {
            System.out.println("=========" + new Date() + "=========");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
