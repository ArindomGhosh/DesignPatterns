package com.hamish.template.hooks;

/**
 * Created by hamishdickson on 16/12/14.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
