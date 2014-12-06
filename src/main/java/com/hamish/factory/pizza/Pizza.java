package com.hamish.factory.pizza;

import java.util.ArrayList;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Factories produce products - in this case, the product is a pizza
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25mins at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
