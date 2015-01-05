package com.hamish.compoundPatterns.patternsTogether.example4;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        // create a new observable
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    /**
     * note for both these methods, we just delegate
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
