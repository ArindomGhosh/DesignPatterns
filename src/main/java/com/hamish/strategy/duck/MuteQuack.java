package com.hamish.strategy.duck;

/**
 * Created by hamishdickson on 09/11/14.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
