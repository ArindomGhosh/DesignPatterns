package com.hamish.strategy.duck.ducks;

import com.hamish.strategy.duck.behaviors.quacking.QuackBehavior;
import com.hamish.strategy.duck.behaviors.flying.FlyBehavior;

/**
 * Created by hamishdickson on 09/11/14.
 *
 * So a duck has some kind of fly behavior and some kind of quack behavior,
 * but the exact implementation varies depending on th type of duck.
 *
 */
public abstract class Duck {
    /**
     * These are interfaces, meaning we don't need to know any of their details.
     * This lets us just refer to the supertype and then set the concrete types in
     * object constructors or setters.
     *
     * ie "program to an interface, not an implementation"
     *
     * note, this doesn't mean a java type interface it really means programs to
     * a supertype
     */
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
