package tech.kirya522.events;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class YouTubeStatsRequestApplicationEvent extends ApplicationEvent {
    public YouTubeStatsRequestApplicationEvent(Object source) {
        super(source);
    }

    public YouTubeStatsRequestApplicationEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
