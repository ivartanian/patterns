package com.vartanian.patterns.factory.ingredientsfacrory;

import com.vartanian.patterns.factory.ingredients.Cheese;
import com.vartanian.patterns.factory.ingredients.Dough;
import com.vartanian.patterns.factory.ingredients.Sauce;

/**
 * Created by super on 10/28/15.
 */
public interface PizzaIngredientFactory {
    Cheese createCheese();
    Dough createDough();
    Sauce createSauce();
}
