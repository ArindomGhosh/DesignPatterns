package com.hamish.command.lambdas;

/**
 * Created by hamishdickson on 10/12/14.
 *
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

}
