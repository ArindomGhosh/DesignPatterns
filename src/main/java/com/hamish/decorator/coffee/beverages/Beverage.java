package com.hamish.decorator.coffee.beverages;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Note: this can be an interface.
 */
public abstract class Beverage {
    // These bit's didn't originally exist (see last commit)
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
