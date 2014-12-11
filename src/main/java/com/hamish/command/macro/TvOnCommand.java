package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class TvOnCommand implements Command {
    TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.on();
    }

}
