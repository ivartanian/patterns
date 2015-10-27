package com.vartanian.patterns.strategy.entitys;

import com.vartanian.patterns.strategy.behaviors.flying.FlyBehavior;
import com.vartanian.patterns.strategy.behaviors.quacking.QuackBehavior;

import java.util.logging.Logger;

/**
 * Created by super on 10/27/15.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        Logger.getLogger(this.getClass().getName()).info("All ducks float, even decoys");
    }



}
