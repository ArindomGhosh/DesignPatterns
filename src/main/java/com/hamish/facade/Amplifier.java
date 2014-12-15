package com.hamish.facade;

/**
 * Created by hamishdickson on 15/12/14.
 */
public class Amplifier {
    public void on() {
        System.out.println("amp on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Set the dvd player");
    }

    public void setSurroundSound() {
        System.out.println("Set the surround sound");
    }

    public void setVolume() {
        System.out.println("set the volume");
    }
}
