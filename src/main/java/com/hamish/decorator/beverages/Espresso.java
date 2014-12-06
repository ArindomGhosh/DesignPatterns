package com.hamish.decorator.beverages;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
