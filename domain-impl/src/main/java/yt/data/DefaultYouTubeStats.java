package yt.data;

import java.util.Objects;

public class DefaultYouTubeStats implements YouTubeStats {
    private final long views;
    private final long subscribers;

    public DefaultYouTubeStats(long views, long subscribers) {
        this.views = views;
        this.subscribers = subscribers;
    }


    @Override
    public long views() {
        return views;
    }

    @Override
    public long subscribers() {
        return subscribers;
    }

    @Override
    public String toString() {
        return "DefaultYouTubeStats{" +
                "views=" + views +
                ", subscribers=" + subscribers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultYouTubeStats that = (DefaultYouTubeStats) o;
        return views == that.views && subscribers == that.subscribers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(views, subscribers);
    }
}
