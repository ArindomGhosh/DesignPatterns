package com.hamish.compoundPatterns.mvc.beatExample;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * controller is the strategy that we plug into the view to give
 * it some smarts
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
