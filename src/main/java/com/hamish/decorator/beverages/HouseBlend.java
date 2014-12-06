package com.hamish.decorator.beverages;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
