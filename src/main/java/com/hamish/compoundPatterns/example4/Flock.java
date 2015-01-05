package com.hamish.compoundPatterns.example4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * remember, the composite needs to implement the same interface as the leaf
 * elements. Our leaf elements are quackables
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        /**
         * iterate through the flock (using .. the iterator pattern) and do
         * some quacking!
         */
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.notifyObservers();
        }
    }
}
