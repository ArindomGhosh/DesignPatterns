package com.hamish.decorator.condiments;

import com.hamish.decorator.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 */
public abstract class CondimentDecorator extends Beverage {

    // we are going to require that the condiment decorators all reimplement this
    public abstract String getDescription();
}
