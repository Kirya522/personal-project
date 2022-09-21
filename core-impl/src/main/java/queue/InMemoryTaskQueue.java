package queue;

import data.IStat;
import task.ScheduledTask;

import java.util.concurrent.LinkedBlockingQueue;

public class InMemoryTaskQueue<T extends IStat> implements TasksQueue<T>  {

    private final LinkedBlockingQueue<ScheduledTask<T>> queue;

    public InMemoryTaskQueue() {
        this.queue = new LinkedBlockingQueue<>();
    }

    @Override
    public boolean push(ScheduledTask<T> scheduledTask) {
        return queue.offer(scheduledTask);
    }

    public long size() {
        return queue.size();
    }
}
