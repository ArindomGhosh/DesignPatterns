package com.hamish.iterator.core;

import java.util.ArrayList;

/**
 * Created by hamishdickson on 17/12/14.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    /**
     * need to check if we are at the end of the array OR since we implemented a
     * max size, we need to check if we are looking at an empty slot!
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
