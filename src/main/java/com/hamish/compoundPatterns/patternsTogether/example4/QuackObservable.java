package com.hamish.compoundPatterns.patternsTogether.example4;

/**
 * Created by hamishdickson on 05/01/15.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer); // register observers
    public void notifyObservers(); // notify
}
