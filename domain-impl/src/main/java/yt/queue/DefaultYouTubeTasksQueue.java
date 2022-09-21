package yt.queue;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import queue.InMemoryTaskQueue;
import queue.eventbased.InMemoryEvents;
import yt.data.YouTubeStats;

@Component
public class DefaultYouTubeTasksQueue extends InMemoryEvents<YouTubeStats> {
    public DefaultYouTubeTasksQueue(ApplicationEventPublisher applicationEventPublisher) {
        super(applicationEventPublisher);
    }
}
