package com.vartanian.patterns.grouppattern.observables;


/**
 * Created by super on 11/3/15.
 */
public interface QuackObservable {
     void registerObserveble(Observer observer);
     void notifyObservers();
}
