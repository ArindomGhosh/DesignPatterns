package com.hamish.strategy.duck;

/**
 * Created by hamishdickson on 09/11/14.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Mute ducky");
    }
}
