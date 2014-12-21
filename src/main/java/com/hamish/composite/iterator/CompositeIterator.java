package com.hamish.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by hamishdickson on 21/12/14.
 *
 * remember to implement the iterator interface
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator iterator) {
        /**
         * going to iterate over what is passed in, throw that into a stack
         */
        stack.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                // we have to be recursive here
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            /**
             * if there is a next element, we get the current iterator off the stack
             * and get it's next element
             */
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();

            /**
             * then throw that components iterator on the stack. if the component is
             * menu, it will iterate over it's items. if the component is a menuitem,
             * then we get the nulliterator and no iteration happens. then we return
             * the component
             */
            stack.push(component.createIterator());

            return component;
        }
        return null;
    }
}
