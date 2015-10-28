package com.vartanian.patterns.factory;

import com.vartanian.patterns.factory.pizza.Pizza;
import com.vartanian.patterns.factory.stories.PizzaStore;
import com.vartanian.patterns.factory.stories.impl.ChicagoPizzaStore;
import com.vartanian.patterns.factory.stories.impl.NYPizzaStore;

import java.util.logging.Logger;

public class Simulator {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        Logger.getLogger(Simulator.class.getName()).info("--------END--------");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        Logger.getLogger(Simulator.class.getName()).info("--------END--------");

    }

}
