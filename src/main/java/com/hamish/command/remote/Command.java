package com.hamish.command.remote;

/**
 * Created by hamishdickson on 09/12/14.
 *
 * All we need is an execute method
 *
 * All RemoteControl commands implement the Command interface, which
 * consists of one method, execute(). Commands encapsulate a set of
 * actions on a specific vendor class. The remote invokes these actions
 * by calling the execute() command.
 */
public interface Command {
    public void execute();

    /**
     *  add undo method
     *
     *  this undoes the last thing done
      */
    public void undo();
}
