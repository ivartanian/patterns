package com.vartanian.patterns.proxy.remote.machine;

import com.vartanian.patterns.proxy.remote.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by super on 11/3/15.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
