package tech.kirya522.services;

import tech.kirya522.events.YouTubeStatsRequestApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class YouTubeStatsScheduler {

    private final ApplicationEventPublisher applicationEventPublisher;

    public YouTubeStatsScheduler(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Scheduled(fixedDelay = 3000)
    public void schedule(){
        applicationEventPublisher.publishEvent(new YouTubeStatsRequestApplicationEvent(this));
    }
}
