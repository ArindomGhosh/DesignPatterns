package com.hamish.command.macro;

/**
 * Created by hamishdickson on 10/12/14.
 *
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.off();
    }

}
