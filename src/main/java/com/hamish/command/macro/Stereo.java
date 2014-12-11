package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 */
public class Stereo {
    private String type;

    public Stereo(String s) {
        this.type = s;
    }

    public void on() {
        System.out.println(type + "Stereo on");
    }

    public void off() {
        System.out.println(type + " stereo off");
    }

    public void setCD() {
        System.out.println(type + "Stereo set CD");
    }

    public void setVolume() {
        System.out.println(type + "Stereo set the volume");
    }
}
