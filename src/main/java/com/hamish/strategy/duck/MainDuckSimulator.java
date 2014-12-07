package com.hamish.strategy.duck;

import com.hamish.strategy.duck.behaviors.flying.FlyRocketPowered;
import com.hamish.strategy.duck.ducks.Duck;
import com.hamish.strategy.duck.ducks.MallardDuck;
import com.hamish.strategy.duck.ducks.ModelDuck;

/**
 * Created by hamishdickson on 09/11/14.
 *
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
