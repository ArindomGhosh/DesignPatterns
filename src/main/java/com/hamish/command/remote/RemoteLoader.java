package com.hamish.command.remote;

/**
 * Created by hamishdickson on 10/12/14.
 *
 * The Command Pattern: encapsulates a request as an object, thereby
 * letting you paramatise other objects with different requests, queue
 * or log requests and support undoable operations
 *
 *
 *
 * This creates a number of command objects that are loaded into slots of the
 * remote control. Each command object encapsulates a request of a home
 * automation device
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /**
         * create devices
         */
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living room");
        CeilingFan ceilingFan = new CeilingFan("Living room");

        /**
         * create all light command objects
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        // .. etc ...

        /**
         * celing fan commands
         */
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        /**
         * put the commands into the slots
         */
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);

        /**
         * we've implemented toString here
         */
        System.out.println(remoteControl);

        /**
         * turn stuff on and off
         */
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);
        System.out.println("Press the undo button");
        remoteControl.undoCommandWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPushed();

        // celing fan stuff
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPushed();

    }
}
