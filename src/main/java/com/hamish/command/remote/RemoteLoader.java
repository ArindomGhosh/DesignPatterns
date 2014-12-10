package com.hamish.command.remote;

/**
 * Created by hamishdickson on 10/12/14.
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

        /**
         * create all light command objects
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        // .. etc ...

        /**
         * put the commands into the slots
         */
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        /**
         * we've implemented toString here
         */
        System.out.println(remoteControl);

        /**
         * turn stuff on and off
         */
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
