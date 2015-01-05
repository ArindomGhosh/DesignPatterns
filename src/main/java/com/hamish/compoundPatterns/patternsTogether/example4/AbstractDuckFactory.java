package com.hamish.compoundPatterns.patternsTogether.example4;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * implementing an abstract factory, it's subclasses will implement to create
 * different families
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
