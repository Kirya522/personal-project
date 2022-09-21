package executor;

import data.IStat;
import task.ScheduledTask;

public interface Executor<T extends IStat> {

    T execute(ScheduledTask<T> task);
}
