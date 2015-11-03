package com.vartanian.patterns.grouppattern.observables.impl;

import com.vartanian.patterns.grouppattern.observables.Observer;
import com.vartanian.patterns.grouppattern.observables.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by super on 11/3/15.
 */
public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserveble(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer next = iterator.next();
            next.update(duck);
        }
    }
}
