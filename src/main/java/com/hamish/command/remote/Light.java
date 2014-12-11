package com.hamish.command.remote;

/**
 * Created by hamishdickson on 09/12/14.
 *
 * The vendor classes are used to preform the actual home-automation work of controlling devices.
 * Here, we are using the light class as an example.
 */
public class Light {
    private String lightType;

    public Light(String s) {
        lightType = s;
    }

    public void on() {
        System.out.println(lightType + "Light on!");
    }

    public void off() {
        System.out.println(lightType + "Light off!");
    }
}
