package com.vartanian.patterns.proxy.remote.machine;


import com.vartanian.patterns.proxy.remote.states.State;
import com.vartanian.patterns.proxy.remote.states.impl.HasQuarterState;
import com.vartanian.patterns.proxy.remote.states.impl.NoQuarterState;
import com.vartanian.patterns.proxy.remote.states.impl.SoldState;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by super on 11/2/15.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private String location;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(String location, int count) throws RemoteException{
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.count = count;
        this.location = location;
        if (count > 0){
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispence();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0){
            count--;
        }
    }
}
