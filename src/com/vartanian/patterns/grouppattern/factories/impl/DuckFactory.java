package com.vartanian.patterns.grouppattern.factories.impl;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.fowls.DuckCall;
import com.vartanian.patterns.grouppattern.fowls.MallardDuck;
import com.vartanian.patterns.grouppattern.fowls.RedheadDuck;
import com.vartanian.patterns.grouppattern.fowls.RubberDuck;
import com.vartanian.patterns.grouppattern.factories.AbstractDuckFactory;

/**
 * Created by super on 11/3/15.
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
