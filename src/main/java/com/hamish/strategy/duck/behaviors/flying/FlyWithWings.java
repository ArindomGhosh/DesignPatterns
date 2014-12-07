package com.hamish.strategy.duck.behaviors.flying;

/**
 * Created by hamishdickson on 09/11/14.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
