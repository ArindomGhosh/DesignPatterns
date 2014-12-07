package com.hamish.observer.weatherStation.byHand;

import java.util.ArrayList;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * This is the big boy that controls everything. This does the hard work and then when
 * it feels good and ready, it notifies the observers, using their update method (they
 * must have one as it's in the interface)
 *
 * The observers ("subscribers") this subject ("publisher") informs is kept in the ArrayList
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * just add a new observer to the end of the array list - nothing fancy
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    /**
     * important bit - because we know they are observers and they must implement update, we can just do this!
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * we notify the observers when we get updated measurements from the weather station
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // other WeatherData methods here doing interesting things
}
