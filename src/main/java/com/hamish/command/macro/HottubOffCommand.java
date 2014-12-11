package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    @Override
    public void execute() {
        hottub.off();
    }

}
