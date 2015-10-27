package com.vartanian.patterns.strategy.entitys;

import com.vartanian.patterns.strategy.behaviors.flying.impl.FlyNoWay;
import com.vartanian.patterns.strategy.behaviors.quacking.impl.Quack;

import java.util.logging.Logger;

/**
 * Created by super on 10/27/15.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        Logger.getLogger(this.getClass().getName()).info("I am a model duck");
    }
}
