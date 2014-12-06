package com.hamish.factory.abstractFactory;

import com.hamish.factory.abstractFactory.veggies.Veggies;

/**
 * Created by hamishdickson on 06/12/14.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
