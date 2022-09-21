package yt.data;

import data.IStat;

public interface YouTubeStats extends IStat {
    long views();

    long subscribers();
}
