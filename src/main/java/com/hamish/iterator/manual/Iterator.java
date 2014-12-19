package com.hamish.iterator.manual;

/**
 * Created by hamishdickson on 17/12/14.
 */
public interface Iterator {
    /**
     * returns a boolean indicaticating whether or not
     * there are more elements to iterate over
     * @return boolean
     */
    boolean hasNext();
    Object next();
}
