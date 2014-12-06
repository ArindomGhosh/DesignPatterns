package com.hamish.decorator.condiments;

import com.hamish.decorator.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Cool - this DECORATES another coffee with mocha stuff (an added
 * description and some more cost)
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
