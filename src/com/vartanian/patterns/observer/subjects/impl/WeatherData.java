package com.vartanian.patterns.observer.subjects.impl;

import com.vartanian.patterns.observer.observers.Observer;
import com.vartanian.patterns.observer.subjects.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by super on 10/27/15.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notiftObservers() {

        observers.forEach(observer -> observer.update(temperature, humidity, pressure));

    }

    public void measurementChanged() {
        notiftObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
