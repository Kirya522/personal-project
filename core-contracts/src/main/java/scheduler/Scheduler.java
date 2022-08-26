package scheduler;

import data.IStat;
import task.ScheduledTask;

public interface Scheduler<T extends IStat> {

    void schedule(ScheduledTask<T> task);
}
