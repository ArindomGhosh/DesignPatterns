package com.hamish.command.remote;

/**
 * Created by hamishdickson on 11/12/14.
 *
 * More complicated example - to properly implement undo, must know the OLD SPEED!
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
