package com.hamish.composite.iterator;

import java.util.Iterator;

/**
 * Created by hamishdickson on 21/12/14.
 *
 * remember, this is the leaf class in our tree
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print(" (v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
