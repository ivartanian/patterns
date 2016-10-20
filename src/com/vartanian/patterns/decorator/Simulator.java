package com.vartanian.patterns.decorator;

import com.vartanian.patterns.decorator.beverages.Beverage;
import com.vartanian.patterns.decorator.beverages.impl.Espresso;
import com.vartanian.patterns.decorator.condiments.impl.Mocha;
import com.vartanian.patterns.decorator.condiments.impl.Soy;
import com.vartanian.patterns.decorator.refresh.AddA;
import com.vartanian.patterns.decorator.refresh.AddB;
import com.vartanian.patterns.decorator.refresh.Concrete;
import com.vartanian.patterns.decorator.refresh.ConcreteA;

import java.util.logging.Logger;

public class Simulator {

    public static void main(String[] args) {

        Concrete concreteA = new ConcreteA();
        concreteA = new AddA(new AddB(concreteA));
        concreteA.work();

//        Beverage beverage = new Espresso();
//        Logger.getLogger(Simulator.class.getName()).info(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage beverage2 = new Espresso();
//        beverage2 =
//                new Mocha(
//                        new Mocha(
//                                new Soy(beverage2)));
//        Logger.getLogger(Simulator.class.getName()).info(beverage2.getDescription() + " $" + beverage2.cost());


    }

}
