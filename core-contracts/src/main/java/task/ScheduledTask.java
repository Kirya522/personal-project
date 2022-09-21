package task;

import data.IStat;

public interface ScheduledTask<T extends IStat> extends Runnable {
    T getResult();
}
