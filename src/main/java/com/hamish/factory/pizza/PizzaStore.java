package com.hamish.factory.pizza;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * This is our abstract creator class. It defines an abstract factory
 * method that the subclasses implement to produce products
 *
 * Often the creator contains code that depends on an abstract product
 * which is produced by a subclass
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        /**
         * createPizza() is our factory method
         */
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
