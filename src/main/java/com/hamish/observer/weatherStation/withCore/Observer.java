package com.hamish.observer.weatherStation.withCore;

/**
 * Created by hamishdickson on 06/12/14.
 */
public interface Observer {
    // ie must implement update
    public void update(float temp, float humidity, float pressure);
}
