package com.hamish.template.hooks;

/**
 * Created by hamishdickson on 16/12/14.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking coffee");
        coffeeWithHook.prepareRecipe();
    }
}
