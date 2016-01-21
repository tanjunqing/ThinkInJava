package TimerTask.TimerTasks;

import java.util.TimerTask;

/**
 * Created by Tan on 16/1/14.
 */
public class timerTasks extends TimerTask {
    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        System.out.println("此时输出:" + System.currentTimeMillis());
    }
}
