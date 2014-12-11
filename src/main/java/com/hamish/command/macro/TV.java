package com.hamish.command.macro;

/**
 * Created by hamishdickson on 09/12/14.
 *
 */
public class TV {
    private String type;

    public TV(String s) {
        type = s;
    }

    public void on() {
        System.out.println(type + " tv on!");
    }

    public void off() {
        System.out.println(type + " tv off!");
    }
}
