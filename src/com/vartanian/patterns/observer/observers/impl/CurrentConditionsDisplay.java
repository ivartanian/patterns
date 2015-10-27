package com.vartanian.patterns.observer.observers.impl;

import com.vartanian.patterns.observer.observers.DisplayElement;
import com.vartanian.patterns.observer.observers.Observer;
import com.vartanian.patterns.observer.subjects.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by super on 10/27/15.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        Logger.getLogger(this.getClass().getName()).info("Current conditions: " + temperature  +"F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
