package com.hamish.composite.iterator;

import java.util.Iterator;

/**
 * Created by hamishdickson on 21/12/14.
 *
 * create an iterator that always returns false when hasNext() is called
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
