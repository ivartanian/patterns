package com.vartanian.patterns.observer.subjects;

import com.vartanian.patterns.observer.observers.Observer;

/**
 * Created by super on 10/27/15.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notiftObservers();

}
