package com.hamish.observer.weatherStation.byHand;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * We have this so you can change what Subject the Displays use. they are coded to the
 * interface, not the implementation.
 *
 * In theory you could swap out the data center if you liked
 */
public interface Subject {
    /**
     * both of these methods take an observer to be added or removed
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // notify all registered observers when subjects state has changed
    public void notifyObservers();
}
