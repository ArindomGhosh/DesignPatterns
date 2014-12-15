package com.hamish.adapter;

/**
 * Created by hamishdickson on 15/12/14.
 */

/**
 * first, implement the interface you want to meet - this is the interface
 * your client wants to use
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * next implement all the methods
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
