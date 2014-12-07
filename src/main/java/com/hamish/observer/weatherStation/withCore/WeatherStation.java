package com.hamish.observer.weatherStation.withCore;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * The Observer Pattern: defines a one-to-many dependence between objects
 * so that when one object so that when one object changes state, all of
 * it's dependents are notified and updated automatically.
 *
 * Implement using java core observer classes
 *
 * This implementation uses the core Observerable and Observer things. We no
 * longer need Subject or Observer
 *
 * See WeatherData for more info, but NOTE:
 * 1) Observable is a class, meaning you have to subclass it - you can only
 *    subclass one class in java
 * 2) The main methods in Observable are protected - meaning to use them
 *    you have to subclass.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
