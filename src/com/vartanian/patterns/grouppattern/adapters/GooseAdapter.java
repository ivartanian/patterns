package com.vartanian.patterns.grouppattern.adapters;

import com.vartanian.patterns.grouppattern.fowls.Goose;
import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.observables.Observer;
import com.vartanian.patterns.grouppattern.observables.impl.Observable;

/**
 * Created by super on 11/3/15.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
