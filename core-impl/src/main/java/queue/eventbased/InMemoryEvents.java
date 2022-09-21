package queue.eventbased;

import data.IStat;
import org.springframework.context.ApplicationEventPublisher;
import queue.TasksQueue;
import task.ScheduledTask;

public class InMemoryEvents<T extends IStat> implements TasksQueue<T> {
    private final ApplicationEventPublisher applicationEventPublisher;

    public InMemoryEvents(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public boolean push(ScheduledTask<T> scheduledTask) {
        return applicationEventPublisher.publishEvent(new GenericApplicationEvent<T>(scheduledTask));
    }

}
