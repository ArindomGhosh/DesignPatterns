package com.hamish.command.lambdas;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
