package com.hamish.command.simple;

/**
 * Created by hamishdickson on 09/12/14.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightCommand lightOn = new LightCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }
}
