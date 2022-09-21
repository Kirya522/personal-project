package tech.kirya522.events;

import tech.kirya522.domain.YouTubeStats;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class YouTubeStatsNewApplicationEvent extends ApplicationEvent {
    private final YouTubeStats stats;

    public YouTubeStatsNewApplicationEvent(Object source, YouTubeStats stats) {
        super(source);
        this.stats = stats;
    }

    public YouTubeStatsNewApplicationEvent(Object source, Clock clock, YouTubeStats stats) {
        super(source, clock);
        this.stats = stats;
    }

    public YouTubeStats getStats() {
        return stats;
    }
}
