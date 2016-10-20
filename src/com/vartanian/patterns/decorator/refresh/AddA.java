package com.vartanian.patterns.decorator.refresh;

/**
 * @author viv
 * @version 1.0
 * @since 20.10.2016
 */
public class AddA extends Decorator{

    public AddA(Concrete concrete) {
        this.concrete = concrete;
    }

    @Override
    public void work() {
        concrete.work();
        System.out.println("\nAddA");
    }
}
