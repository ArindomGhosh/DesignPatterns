package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    @Override
    public void execute() {
        hottub.on();
    }

}
