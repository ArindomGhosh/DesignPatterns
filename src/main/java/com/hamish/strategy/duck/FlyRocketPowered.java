package com.hamish.strategy.duck;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
