package com.hamish.composite.iterator;

import java.util.Iterator;

/**
 * Created by hamishdickson on 21/12/14.
 *
 * The role of the menu component is to provide an interface for the
 * leaf nodes and composite notes.
 *
 * so some of this doesn't make sence for both leaves and composite nodes,
 * in those cases you leave the method unimplemented and just inherit an
 * exception
 */
public abstract class MenuComponent {
    /**
     * these 3 are the "composite" methods - methods that add/remove
     * /get menucomponents
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * These are the "operation methods" these are used by the menu items. A
     * couple of them can be used in Menu too
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}
