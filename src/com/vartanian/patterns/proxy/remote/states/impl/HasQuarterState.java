package com.vartanian.patterns.proxy.remote.states.impl;

import com.vartanian.patterns.proxy.remote.machine.GumballMachine;
import com.vartanian.patterns.proxy.remote.states.State;

/**
 * Created by super on 11/2/15.
 */
public class HasQuarterState implements State {

    private transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispence() {
        System.out.println("No gumball dispenced");
    }
}
