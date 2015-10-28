package com.vartanian.patterns.factory.stories.impl;

import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;
import com.vartanian.patterns.factory.ingredientsfacrory.impl.ChicagoPizzaIngredientFactory;
import com.vartanian.patterns.factory.pizza.Pizza;
import com.vartanian.patterns.factory.pizza.impl.ChicagoStyleCheesePizza;
import com.vartanian.patterns.factory.stories.PizzaStore;

/**
 * Created by super on 10/28/15.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
            return pizza;
        }
        return null;
    }

}
