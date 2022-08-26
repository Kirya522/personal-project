package yt.task;

import data.ReturnValue;
import task.ScheduledTask;
import yt.data.YouTubeStats;

public class DefaultYouTubeStatsTask implements YouTubeStatsTask {

    private ReturnValue<YouTubeStats> result;

    public ReturnValue<YouTubeStats> getResult(){
        return result;
    }

    @Override
    public void run() {
        //API CALL

        result = null;
    }
}
