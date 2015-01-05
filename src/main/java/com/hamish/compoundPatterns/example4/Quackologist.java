package com.hamish.compoundPatterns.example4;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
