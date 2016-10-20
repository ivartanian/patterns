package com.vartanian.patterns.decorator.refresh;

/**
 * @author viv
 * @version 1.0
 * @since 20.10.2016
 */
public class AddB extends Decorator{

    public AddB(Concrete concrete) {
        this.concrete = concrete;
    }

    @Override
    public void work() {
        concrete.work();
        System.out.println("\nAddB");
    }
}
