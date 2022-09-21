package tech.kirya522.listeners;

import tech.kirya522.domain.YouTubeStats;
import tech.kirya522.events.YouTubeStatsPostApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class YouTubeStatsPostApplicationEventListener implements ApplicationListener<YouTubeStatsPostApplicationEvent> {

    @Async
    @Override
    public void onApplicationEvent(YouTubeStatsPostApplicationEvent event) {
        YouTubeStats stats = event.getStats();
        System.out.printf("New Stats = %s\n", stats.toString());
    }
}
