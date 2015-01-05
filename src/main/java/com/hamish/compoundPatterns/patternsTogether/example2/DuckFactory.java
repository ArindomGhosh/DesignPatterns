package com.hamish.compoundPatterns.patternsTogether.example2;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * lets start off by creating an example without decorators, just to get to grip with
 * things
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
