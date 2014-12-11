package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class TvOffCommand implements Command {
    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.off();
    }

}
