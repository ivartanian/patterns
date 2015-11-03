package com.vartanian.patterns.proxy.remote.states.impl;

import com.vartanian.patterns.proxy.remote.machine.GumballMachine;
import com.vartanian.patterns.proxy.remote.states.State;

/**
 * Created by super on 11/2/15.
 */
public class NoQuarterState implements State {

    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");
    }

    @Override
    public void dispence() {
        System.out.println("You need to pay first");
    }
}
