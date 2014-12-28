package com.hamish.proxy.remote;

import java.io.Serializable;

/**
 * Created by hamishdickson on 28/12/14.
 *
 * could really change this to an abstract class and let it implement a lot of
 * behavior.
 *
 * IMPORTANT: this has to be serializable for a proxy
 *
 * There is a problem with this - each state (eg NoQuarterState) has a state in it,
 * to deal with this you have to add a serialVersionUID and a transient
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
