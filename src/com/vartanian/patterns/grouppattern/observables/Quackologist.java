package com.vartanian.patterns.grouppattern.observables;

/**
 * Created by super on 11/3/15.
 */
public class Quackologist implements Observer  {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
