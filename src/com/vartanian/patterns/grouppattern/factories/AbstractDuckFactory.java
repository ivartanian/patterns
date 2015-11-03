package com.vartanian.patterns.grouppattern.factories;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;

/**
 * Created by super on 11/3/15.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();

}
