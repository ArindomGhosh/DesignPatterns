package com.hamish.strategy.duck.behaviors.quacking;

/**
 * Created by hamishdickson on 09/11/14.
 *
 * Each type of duck has a quack behavior
 *
 * Implementing this allows us to create new behaviors without changing
 * any existing code
 *
 */
public interface QuackBehavior {
    public void quack();
}
