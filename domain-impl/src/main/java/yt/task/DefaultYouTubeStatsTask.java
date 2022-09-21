package yt.task;

import yt.data.DefaultYouTubeStats;
import yt.data.YouTubeStats;
import yt.queue.YouTubeStatsTasksQueue;

import java.util.Queue;

public class DefaultYouTubeStatsTask implements YouTubeStatsTask {
    private YouTubeStats result;


    public YouTubeStats getResult() {
        return result;
    }

    @Override
    public void run() {
        //API CALL service call
        result = new DefaultYouTubeStats(1, 1);
    }
}
