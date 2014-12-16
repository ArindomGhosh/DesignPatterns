package com.hamish.template.simple;

/**
 * Created by hamishdickson on 16/12/14.
 *
 * Template method defines the steps of an algorithm and allows
 * subclasses to provide the implementation for one or more steps
 *
 * The Template method: defines the skeleton for an algorithm in a
 * method, deferring some steps to subclasses. Template method lets
 * subclasses redefine certain steps of an algorithm without changing
 * the algorithm's structure
 */
public abstract class CaffeineBeverage {

    /**
     * THIS IS OUR TEMPLATE METHOD
     *
     * Some methods handled here, others must be implemented
     *
     * always final, since we don't want people changing this part
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        hook();
    }

    /**
     * a hook is a method that can be overriden, but doesn't have to be
     */
    private void hook() {}

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
