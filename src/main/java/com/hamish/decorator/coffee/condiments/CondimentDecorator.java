package com.hamish.decorator.coffee.condiments;

import com.hamish.decorator.coffee.beverages.Beverage;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Note: we are extending an abstract class here, because Beverage is an abstract class
 * it could just as well have been an interface.
 *
 * The important bit is we are reusing it's interface (not in the java sense)
 *
 * Composition (over inheritance) doesn't have to mean "use interfaces"
 */
public abstract class CondimentDecorator extends Beverage {

    // we are going to require that the condiment decorators all reimplement this
    public abstract String getDescription();
}
