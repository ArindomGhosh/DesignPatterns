package com.hamish.command.lambdas;


/**
 * Created by hamishdickson on 10/12/14.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command - does nothing");
    }

}
