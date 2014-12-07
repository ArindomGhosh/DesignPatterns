package com.hamish.observer.weatherStation.byHand;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Implementated by all the displays - they need an update method
 */
public interface Observer {
    // ie must implement update
    public void update(float temp, float humidity, float pressure);
}
