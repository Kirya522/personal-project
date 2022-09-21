package scheduler;

import data.IStat;
import task.ScheduledTask;

public interface Scheduler<T extends IStat> {

    boolean schedule();
}
