package com.hamish.command.simple;

/**
 * Created by hamishdickson on 09/12/14.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightCommand lightOn = new LightCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
