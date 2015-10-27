package com.vartanian.patterns.strategy.behaviors.quacking.impl;

import com.vartanian.patterns.strategy.behaviors.quacking.QuackBehavior;

import java.util.logging.Logger;

/**
 * Created by super on 10/27/15.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        Logger.getLogger(this.getClass().getName()).info("silence");
    }
}
