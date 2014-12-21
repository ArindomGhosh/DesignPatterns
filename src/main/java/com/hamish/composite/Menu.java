package com.hamish.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hamishdickson on 21/12/14.
 *
 * this can hold menu items or other menus
 *
 * notice here, we don't override getPrice() or isVegetarian() because they don't
 * really make sense for a menu. If someone tries to use it, they will get an
 * exception.
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        /**
         * this is kind of cool and recursive
         *
         * run through each leaf below and get it to print .. if that's a
         * component, then that will run through all it's leaves ... :)
         */
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
