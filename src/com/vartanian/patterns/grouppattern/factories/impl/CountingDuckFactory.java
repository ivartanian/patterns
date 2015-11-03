package com.vartanian.patterns.grouppattern.factories.impl;

import com.vartanian.patterns.grouppattern.behaviors.counters.QuackCounter;
import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.fowls.DuckCall;
import com.vartanian.patterns.grouppattern.fowls.MallardDuck;
import com.vartanian.patterns.grouppattern.fowls.RedheadDuck;
import com.vartanian.patterns.grouppattern.fowls.RubberDuck;
import com.vartanian.patterns.grouppattern.factories.AbstractDuckFactory;

/**
 * Created by super on 11/3/15.
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
