package com.hamish.iterator.manual;

/**
 * Created by hamishdickson on 17/12/14.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * need to check if we are at the end of the array OR since we implemented a
     * max size, we need to check if we are looking at an empty slot!
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
