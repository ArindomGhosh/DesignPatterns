package com.hamish.command.simple;

/**
 * Created by hamishdickson on 09/12/14.
 */
public class SimpleRemoteControl {
    /**
     * one slot for one device
     */
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
