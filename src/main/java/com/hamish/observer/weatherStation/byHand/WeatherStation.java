package com.hamish.observer.weatherStation.byHand;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * The Observer Pattern: defines a one-to-many dependence between objects
 * so that when one object so that when one object changes state, all of
 * it's dependents are notified and updated automatically.
 *
 * These objects are loosely coupled - ie they are connected, but have
 * little knowledge of how one another works. Should always strive for this
 */
public class WeatherStation {
    public static void main(String[] args) {
        /**
         * the displays are coded to the subject interface, you have to tell them
         * what Subject to use - in this case we only have WeatherData, but there
         * could be others
         */
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
