package com.vartanian.patterns.factory.stories;

import com.vartanian.patterns.factory.pizza.Pizza;

/**
 * Created by super on 10/28/15.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        if (pizza == null){
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
