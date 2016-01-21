package TimerTask.ScheduledThreadPoolExecutor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Tan on 16/1/14.
 */
public class ScheduledThreadPoolExecutorDemo {
    public static ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2);
    public static int index = 0;

    public static void main(String... args) {
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new runnableTask(), 2000, 1000, TimeUnit.MILLISECONDS);
    }
}
