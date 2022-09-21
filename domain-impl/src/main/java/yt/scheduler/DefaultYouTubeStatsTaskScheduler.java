package yt.scheduler;

import task.ScheduledTask;
import yt.data.YouTubeStats;
import yt.executor.YouTubeStatsExecutor;
import yt.queue.YouTubeStatsTasksQueue;
import yt.task.DefaultYouTubeStatsTask;

public class DefaultYouTubeStatsTaskScheduler implements YouTubeStatsTaskScheduler{
    private final YouTubeStatsTasksQueue queue;

    public DefaultYouTubeStatsTaskScheduler(YouTubeStatsTasksQueue queue) {
        this.queue = queue;
    }

    @Override
    public boolean schedule() {
        DefaultYouTubeStatsTask task = new DefaultYouTubeStatsTask();
        return queue.push(task);
    }
}