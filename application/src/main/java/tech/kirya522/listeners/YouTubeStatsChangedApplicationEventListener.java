package tech.kirya522.listeners;

import tech.kirya522.domain.YouTubeStats;
import tech.kirya522.events.YouTubeStatsNewApplicationEvent;
import tech.kirya522.events.YouTubeStatsPostApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class YouTubeStatsChangedApplicationEventListener implements ApplicationListener<YouTubeStatsNewApplicationEvent> {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final Random random;

    public YouTubeStatsChangedApplicationEventListener(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        random = new Random();
    }

    @Async
    @Override
    public void onApplicationEvent(YouTubeStatsNewApplicationEvent event) {

        // get old value
        YouTubeStats newStats = event.getStats();
        // service.getold
        // compare

        boolean shouldSend = random.nextBoolean();
        // save
        // service.save
        if (shouldSend) {
            applicationEventPublisher.publishEvent(new YouTubeStatsPostApplicationEvent(this, newStats));
        }
    }
}
