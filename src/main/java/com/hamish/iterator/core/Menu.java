package com.hamish.iterator.core;

import java.util.Iterator;

/**
 * Created by hamishdickson on 19/12/14.
 *
 * Both menus have the same methods ... so add an interface!
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
