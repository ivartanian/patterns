package com.vartanian.patterns.proxy.remote.states.impl;

import com.vartanian.patterns.proxy.remote.machine.GumballMachine;
import com.vartanian.patterns.proxy.remote.states.State;

/**
 * Created by super on 11/2/15.
 */
public class SoldState implements State {

    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait... We are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispence() {
        gumballMachine.releaseBall();
        System.out.println("A gumball comes rolling out the slot");
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
