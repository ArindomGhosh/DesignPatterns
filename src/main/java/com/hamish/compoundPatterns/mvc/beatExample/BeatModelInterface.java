package com.hamish.compoundPatterns.mvc.beatExample;

/**
 * Created by hamishdickson on 05/01/15.
 */
public interface BeatModelInterface {
    /**
     * these are the methods the controller will use to
     * direct the model based on user interaction
     */

    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    /**
     * basically these allow the view and controller to get the state
     * and register observers
     */

    int getBPM();

    // observer that wants to know when the beat changes
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    // observer that wants to know when the BPM changes
    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
