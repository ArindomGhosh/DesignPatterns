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

    /**
     * need a reference to the object
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * next implement all the methods in the interface
     *
     * quack translation is easy, just call the gobble() method
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * even though both interfaces have a fly method, Turkeys fly in
     * short bursts - they can't fo long distance flying like ducks.
     * Therefore, a map between the two fly methods should be scaled
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
