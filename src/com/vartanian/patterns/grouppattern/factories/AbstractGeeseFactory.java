package com.vartanian.patterns.grouppattern.factories;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;

/**
 * Created by super on 11/3/15.
 */
public abstract class AbstractGeeseFactory {

    public abstract Quackable createGoose();

}
