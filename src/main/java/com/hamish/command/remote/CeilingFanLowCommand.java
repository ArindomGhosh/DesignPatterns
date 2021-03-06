package com.hamish.command.remote;

/**
 * Created by hamishdickson on 11/12/14.
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if (previousSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (previousSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (previousSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (previousSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }

        // else - I guess do nothing
    }
}
