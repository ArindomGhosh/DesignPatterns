package com.hamish.observer.weatherStation.withCore;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    /**
     * note, when we did this before, we used Subject
     */
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "C degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
