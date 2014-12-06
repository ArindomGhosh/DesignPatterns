package com.hamish.observer.weatherStation.byHand;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * The Observer Pattern: defines a one-to-many dependence between objects
 * so that when one object so that when one object changes state, all of
 * it's dependents are notified and updated automatically.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
