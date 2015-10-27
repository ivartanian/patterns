package com.vartanian.patterns.decorator;

import com.vartanian.patterns.decorator.beverages.Beverage;
import com.vartanian.patterns.decorator.beverages.impl.Espresso;
import com.vartanian.patterns.decorator.condiments.impl.Mocha;
import com.vartanian.patterns.decorator.condiments.impl.Soy;

import java.util.logging.Logger;

public class Simulator {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        Logger.getLogger(Simulator.class.getName()).info(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 =
                new Mocha(
                        new Mocha(
                                new Soy(beverage2)));
        Logger.getLogger(Simulator.class.getName()).info(beverage2.getDescription() + " $" + beverage2.cost());


    }

}
