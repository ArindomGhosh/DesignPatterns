package com.hamish.strategy.duck.ducks;

import com.hamish.strategy.duck.behaviors.quacking.Quack;
import com.hamish.strategy.duck.behaviors.flying.FlyWithWings;

/**
 * Created by hamishdickson on 09/11/14.
 *
 * This is a type of duck
 *
 * The CONSTRUCTOR decides what the initial behaviors are (you can change them later
 * with setters ... at runtime which is cool)
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
