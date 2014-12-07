package com.hamish.observer.weatherStation.byHand;

/**
 * Created by hamishdickson on 06/12/14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    /**
     * note this - its coded to the interface not the implementation - meaning
     * it doesn't care too much about which data center it uses. It only cares
     * that there is A data center
     */
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "C degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
