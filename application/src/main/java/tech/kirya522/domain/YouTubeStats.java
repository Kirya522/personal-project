package tech.kirya522.domain;

public class YouTubeStats {
    public final long views;
    public final long subscribers;

    public YouTubeStats(long views, long subscribers) {
        this.views = views;
        this.subscribers = subscribers;
    }

    public long getViews() {
        return views;
    }

    public long getSubscribers() {
        return subscribers;
    }

    @Override
    public String toString() {
        return "YouTubeStats{" +
                "views=" + views +
                ", subscribers=" + subscribers +
                '}';
    }
}
