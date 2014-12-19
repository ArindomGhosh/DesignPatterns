package com.hamish.iterator.manual;

/**
 * Created by hamishdickson on 17/12/14.
 */
public class MenuItem {
    String name;
    String desciption;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
