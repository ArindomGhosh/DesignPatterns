package com.hamish.command.macro;

/**
 * Created by hamishdickson on 11/12/14.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light("Living room");
        TV tv = new TV("Living room");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

    }
}
