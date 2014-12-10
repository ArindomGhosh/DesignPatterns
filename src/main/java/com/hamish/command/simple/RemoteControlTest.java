package com.hamish.command.simple;

/**
 * Created by hamishdickson on 09/12/14.
 *
 * The command pattern: encapsulates a request as an object,
 * thereby letting you parameterize other objects with different
 * requests, queue or log requests, and support undoable
 * operations.
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
