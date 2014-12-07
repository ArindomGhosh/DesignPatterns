package com.hamish.observer.weatherStation.withCore;

import java.util.Observable;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * So java actually has an inbuilt observable class ... which looks like it might be thread safe
 *
 * with this you don't have to implement the list (actually it uses a Vector) yourself, the
 * observable class does it
 *
 * Also, this has push and pull methods
 *
 * hey .. there is a public countObservers method (which is implementated) ... meaning anyone
 * can find out how many observers there are
 *
 * Note, before this implemented Subject
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        /**
         * setChanged() kind of looks like this:
         *
         * setChanged() {
         *      changed = true;
         * }
         *
         * You must call this if you want to notify your observers - normally this would be
         * conditional on something, say if temp change is greater than 1 degree
         */

        setChanged();

        /**
         * notice we aren't sending a data object with the notifyObservers() call
         * that means we're using the PULL mode!
         *
         * notifyObservers() kind of looks like this:
         *
         * notifyObservers() {
         *      if (changed) {
         *          for every observer in the list {
         *              call update(this, arg)
         *          }
         *          changed = false
         *      }
         * }
         */
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); // ie call setChanged and then notifyObservers
    }


    /**
     * in case people want to PULL the data directly .. which sounds like a bad idea to me
     * but there you go!
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // other WeatherData methods here
}
