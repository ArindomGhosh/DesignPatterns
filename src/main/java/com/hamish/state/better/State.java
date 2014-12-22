package com.hamish.state.better;

/**
 * Created by hamishdickson on 22/12/14.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
