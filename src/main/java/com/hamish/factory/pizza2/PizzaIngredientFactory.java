package com.hamish.factory.pizza2;

import com.hamish.factory.pizza2.veggies.Veggies;

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
