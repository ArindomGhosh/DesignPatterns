package com.hamish.decorator.coffee.beverages;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
