package tech.kirya522.events;

import tech.kirya522.domain.YouTubeStats;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class YouTubeStatsPostApplicationEvent extends ApplicationEvent {
    private final YouTubeStats stats;

    public YouTubeStatsPostApplicationEvent(Object source, YouTubeStats stats) {
        super(source);
        this.stats = stats;
    }

    public YouTubeStatsPostApplicationEvent(Object source, Clock clock, YouTubeStats stats) {
        super(source, clock);
        this.stats = stats;
    }

    public YouTubeStats getStats() {
        return stats;
    }
}
