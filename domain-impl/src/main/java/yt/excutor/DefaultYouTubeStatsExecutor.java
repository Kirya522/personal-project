package yt.excutor;

import task.ScheduledTask;
import yt.data.YouTubeStats;
import yt.executor.YouTubeStatsExecutor;

public class DefaultYouTubeStatsExecutor implements YouTubeStatsExecutor {
    // thread pool
    @Override
    public YouTubeStats execute(ScheduledTask<YouTubeStats> task) {
        return null;
    }
}
