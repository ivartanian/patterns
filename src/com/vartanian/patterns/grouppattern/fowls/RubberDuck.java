package com.vartanian.patterns.grouppattern.fowls;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.observables.Observer;
import com.vartanian.patterns.grouppattern.observables.impl.Observable;

/**
 * Created by super on 11/3/15.
 */
public class RubberDuck implements Quackable {

    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserveble(Observer observer) {
        observable.registerObserveble(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
