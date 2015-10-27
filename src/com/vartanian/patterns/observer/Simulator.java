package com.vartanian.patterns.observer;

import com.vartanian.patterns.observer.observers.Observer;
import com.vartanian.patterns.observer.observers.impl.CurrentConditionsDisplay;
import com.vartanian.patterns.observer.subjects.Subject;
import com.vartanian.patterns.observer.subjects.impl.WeatherData;

public class Simulator {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 30, 45);
        weatherData.setMeasurement(81, 32, 41);
        weatherData.setMeasurement(87, 34, 53);

    }

}
