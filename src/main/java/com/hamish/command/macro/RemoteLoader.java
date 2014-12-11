package com.hamish.command.macro;

/**
 * Created by hamishdickson on 11/12/14.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living room");
        TV tv = new TV("Living room");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOnCommand, stereoOnCommand, tvOnCommand, hottubOnCommand };
        Command[] partyOff = { lightOffCommand, stereoOffCommand, tvOffCommand, hottubOffCommand };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("-------- Putting macro on --------");
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
    }
}
