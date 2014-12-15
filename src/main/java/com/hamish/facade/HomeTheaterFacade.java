package com.hamish.facade;

/**
 * Created by hamishdickson on 15/12/14.
 */
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim();
        screen.down();
        projector.on();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting the movie theater down...");
        // turn things off
    }
}
