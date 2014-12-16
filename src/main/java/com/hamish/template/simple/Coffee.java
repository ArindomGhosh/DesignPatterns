package com.hamish.template.simple;

/**
 * Created by hamishdickson on 16/12/14.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk"); //guh!
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
