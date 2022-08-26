package task;

import data.IStat;
import data.ReturnValue;

public interface ScheduledTask<T extends IStat> extends Runnable {
    ReturnValue<T> getResult();
}
