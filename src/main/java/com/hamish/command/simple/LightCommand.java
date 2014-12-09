package com.hamish.command.simple;

/**
 * Created by hamishdickson on 09/12/14.
 */
public class LightCommand implements Command {
    Light light;

    /**
     * constructor passed the specific light this is going to control
     * @param light
     */
    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
