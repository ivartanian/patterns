package com.vartanian.patterns.factory.stories.impl;

import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;
import com.vartanian.patterns.factory.ingredientsfacrory.impl.NYPizzaIngredientFactory;
import com.vartanian.patterns.factory.pizza.Pizza;
import com.vartanian.patterns.factory.pizza.impl.NYStyleCheesePizza;
import com.vartanian.patterns.factory.stories.PizzaStore;

/**
 * Created by super on 10/28/15.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)){
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
            return pizza;
        }
        return null;
    }

}
