package com.hamish.command.lambdas;

/**
 * Created by hamishdickson on 11/12/14.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living room");

        /**
         * bitchin!!
         *
         * that bins buckets of code!
         */
        remoteControl.setCommand(0, () -> {light.on();}, () -> {light.off();});

        /**
         * can do even better with method references
         */
        remoteControl.setCommand(1, light::on, light::off );

        System.out.println(remoteControl);
        System.out.println("-------- Putting macro on --------");
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
    }
}
