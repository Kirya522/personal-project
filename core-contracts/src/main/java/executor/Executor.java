package executor;

import data.IStat;
import data.ReturnValue;
import task.ScheduledTask;

import java.util.Optional;

public interface Executor<T extends IStat> {

    ReturnValue<T> execute(ScheduledTask<T> task);
}
