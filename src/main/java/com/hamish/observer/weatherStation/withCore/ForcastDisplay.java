package com.hamish.observer.weatherStation.withCore;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class ForcastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.9f;
    private float lastPressure;

    public ForcastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        // some display code
        System.out.println("Forcast display says last pressure: " + lastPressure + "\nand current pressure is: " + currentPressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
