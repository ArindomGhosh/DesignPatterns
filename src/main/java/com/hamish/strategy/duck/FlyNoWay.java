package com.hamish.strategy.duck;

/**
 * Created by hamishdickson on 09/11/14.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
