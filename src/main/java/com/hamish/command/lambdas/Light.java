package com.hamish.command.lambdas;

/**
 * Created by hamishdickson on 09/12/14.
 *
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
