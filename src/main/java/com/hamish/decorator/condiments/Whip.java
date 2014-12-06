package com.hamish.decorator.condiments;

import com.hamish.decorator.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
