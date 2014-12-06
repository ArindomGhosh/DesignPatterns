package com.hamish.decorator.coffee.condiments;

import com.hamish.decorator.coffee.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 */
public abstract class CondimentDecorator extends Beverage {

    // we are going to require that the condiment decorators all reimplement this
    public abstract String getDescription();
}
