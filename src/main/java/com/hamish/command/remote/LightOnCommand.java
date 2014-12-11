package com.hamish.command.remote;

/**
 * Created by hamishdickson on 10/12/14.
 *
 * Using the Command interface, we implement each action that can be invoked by pressing a button on the
 * remote with a simple Command object. The command object holds a reference to an object that is an
 * instance of a Vendor class and implements an execute methods that calls one or more methods on that
 * object. Here this class turns a light on
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    /**
     * a bit rubbish - you have to manually specify this
     */
    @Override
    public void undo() {
        light.off();
    }
}
