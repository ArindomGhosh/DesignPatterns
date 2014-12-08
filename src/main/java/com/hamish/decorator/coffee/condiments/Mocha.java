package com.hamish.decorator.coffee.condiments;

import com.hamish.decorator.coffee.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Cool - this DECORATES another coffee with mocha stuff (an added
 * description and some more cost)
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    /**
     * note this only has one constructor, which takes a beverage to decorate
     */
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
