package com.hamish.decorator.beverages;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
