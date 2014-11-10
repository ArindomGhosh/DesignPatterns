package com.hamish.strategy.duck;

/**
 * Created by hamishdickson on 09/11/14.
 *
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}
