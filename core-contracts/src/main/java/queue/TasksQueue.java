package queue;

import data.IStat;
import task.ScheduledTask;

public interface TasksQueue<T extends IStat> {
    boolean push(ScheduledTask<T> scheduledTask);
}
