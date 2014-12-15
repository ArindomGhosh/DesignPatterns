package com.hamish.facade;

/**
 * Created by hamishdickson on 15/12/14.
 *
 * Facade pattern: provides a unified interface to a set of interfaces
 * in a subsystem. Facade defines a higher-level interface that makes the
 * subsystem easier to use
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        /**
         * instantiate components here
         *
         * here we're creating the components right in the test drive.
         * Normally the client is given a facade; it doesn't have to
         * construct one itself
         */

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvdPlayer,
                cdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie("Raiders of the lost ark");
        homeTheaterFacade.endMovie();
    }
}
