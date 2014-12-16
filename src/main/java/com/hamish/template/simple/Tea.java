package com.hamish.template.simple;

/**
 * Created by hamishdickson on 16/12/14.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
