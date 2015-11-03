package com.vartanian.patterns.grouppattern.behaviors.counters;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.observables.Observer;

/**
 * Created by super on 11/3/15.
 */
public class QuackCounter implements Quackable{

    private Quackable duck;
    private static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserveble(Observer observer) {
        duck.registerObserveble(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
