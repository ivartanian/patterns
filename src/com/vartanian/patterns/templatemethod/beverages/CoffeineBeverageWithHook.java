package com.vartanian.patterns.templatemethod.beverages;

/**
 * Created by super on 10/29/15.
 */
public abstract class CoffeineBeverageWithHook {

    public final void prepareRecipe(){

        boilWater();
        brew();
        pourInCup();
        if (consumerWantCondiments()){
            addCondiments();
        }

    }

    protected final void boilWater(){
        System.out.println("Water boiling...");
    }

    protected final void pourInCup(){
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected boolean consumerWantCondiments(){
        return true;
    }

}
