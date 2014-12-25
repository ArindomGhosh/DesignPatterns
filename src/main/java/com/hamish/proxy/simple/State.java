package com.hamish.proxy.simple;

/**
 * Created by hamishdickson on 22/12/14.
 *
 * could really change this to an abstract class and let it implement a lot of
 * behavior.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
