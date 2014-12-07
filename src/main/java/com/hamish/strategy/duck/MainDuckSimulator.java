package com.hamish.strategy.duck;

import com.hamish.strategy.duck.behaviors.flying.FlyRocketPowered;
import com.hamish.strategy.duck.ducks.Duck;
import com.hamish.strategy.duck.ducks.MallardDuck;
import com.hamish.strategy.duck.ducks.ModelDuck;

/**
 * Created by hamishdickson on 09/11/14.
 *
 * The Strategy Pattern: defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 *
 * Whole idea behind this is: take what varies and encapsulate it
 * so it won't affect the rest of your code. Then, just refer to the
 * supertype everywhere except where you have to set the concrete type
 * ie in a constructor or a setter
 *
 * "program to an interface, not an implementation" - interface
 * not in the java sense, in the supertype sense..
 *
 * There is quite a lot of power here
 */
public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
