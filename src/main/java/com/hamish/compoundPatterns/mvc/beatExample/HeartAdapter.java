package com.hamish.compoundPatterns.mvc.beatExample;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * This is pretty common with MVC - create an adapter to use a model
 */
public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    /**
     * not sure what these are for a heart .. but they sound scary!
     */
    @Override
    public void initialize() {}

    @Override
    public void on() {}

    @Override
    public void off() {}

    @Override
    public void setBPM(int bpm) {}

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }

}
