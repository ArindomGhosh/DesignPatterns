package com.hamish.compoundPatterns.patternsTogether.example;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * decorator to do the count - ie add behavior
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
