package com.hamish.decorator.coffee.condiments;

import com.hamish.decorator.coffee.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
