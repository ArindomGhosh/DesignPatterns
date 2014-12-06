package com.hamish.factory.pizza2;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
