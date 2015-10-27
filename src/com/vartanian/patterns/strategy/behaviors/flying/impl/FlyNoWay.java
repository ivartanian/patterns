package com.vartanian.patterns.strategy.behaviors.flying.impl;

import com.vartanian.patterns.strategy.behaviors.flying.FlyBehavior;

import java.util.logging.Logger;

/**
 * Created by super on 10/27/15.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        Logger.getLogger(this.getClass().getName()).info("I can't fly!!!");
    }
}
