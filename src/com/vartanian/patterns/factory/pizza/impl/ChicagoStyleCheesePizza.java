package com.vartanian.patterns.factory.pizza.impl;

import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;
import com.vartanian.patterns.factory.pizza.Pizza;

/**
 * Created by super on 10/28/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
