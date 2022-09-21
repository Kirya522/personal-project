package tech.kirya522.listeners;

import tech.kirya522.domain.YouTubeStats;
import tech.kirya522.events.YouTubeStatsNewApplicationEvent;
import tech.kirya522.events.YouTubeStatsRequestApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class YouTubeStatsRequestApplicationEventListener implements ApplicationListener<YouTubeStatsRequestApplicationEvent> {

    private final ApplicationEventPublisher applicationEventPublisher;

    public YouTubeStatsRequestApplicationEventListener(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Async
    @Override
    public void onApplicationEvent(YouTubeStatsRequestApplicationEvent event) {

        // get new value from api
        YouTubeStats currentStats = new YouTubeStats(1000L, 390L);

        applicationEventPublisher.publishEvent(new YouTubeStatsNewApplicationEvent(this, currentStats));
    }
}
