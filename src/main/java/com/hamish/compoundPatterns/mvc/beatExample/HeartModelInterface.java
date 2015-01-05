package com.hamish.compoundPatterns.mvc.beatExample;

/**
 * Created by hamishdickson on 05/01/15.
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
