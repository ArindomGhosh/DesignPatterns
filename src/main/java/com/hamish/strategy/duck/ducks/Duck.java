package com.hamish.strategy.duck.ducks;

import com.hamish.strategy.duck.behaviors.quacking.QuackBehavior;
import com.hamish.strategy.duck.behaviors.flying.FlyBehavior;

/**
 * Created by hamishdickson on 09/11/14.
 *
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float - even decoys");
    }
}
