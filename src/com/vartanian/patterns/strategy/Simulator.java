package com.vartanian.patterns.strategy;

import com.vartanian.patterns.strategy.entitys.Duck;
import com.vartanian.patterns.strategy.entitys.MallardDuck;

public class Simulator {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        duck.performFly();
        duck.performQuack();


    }

}
