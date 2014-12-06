package com.hamish.factory.pizza;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else return null;
    }
}
