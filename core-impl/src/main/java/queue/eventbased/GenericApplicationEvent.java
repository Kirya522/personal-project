package queue.eventbased;

import data.IStat;
import org.springframework.context.ApplicationEvent;
import task.ScheduledTask;

import java.time.Clock;

public class GenericApplicationEvent<T extends ScheduledTask> extends ApplicationEvent {
    public GenericApplicationEvent(T source) {
        super(source);
    }

    public GenericApplicationEvent(T source, Clock clock) {
        super(source, clock);
    }
}
