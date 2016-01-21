package TimerTask.ScheduledThreadPoolExecutor;

/**
 * Created by Tan on 16/1/14.
 */
public class runnableTask implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        ScheduledThreadPoolExecutorDemo.index++;
        if (ScheduledThreadPoolExecutorDemo.index > 10) {
            ScheduledThreadPoolExecutorDemo.scheduledThreadPoolExecutor.shutdown();
        }
        if (ScheduledThreadPoolExecutorDemo.scheduledThreadPoolExecutor.isShutdown()) {
            System.out.println("已经停止了" + "index:" + ScheduledThreadPoolExecutorDemo.index);
        } else {
            System.out.println("此时输出:" + System.currentTimeMillis() + "index:" + ScheduledThreadPoolExecutorDemo.index);
        }
    }
}
