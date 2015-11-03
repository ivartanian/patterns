package com.vartanian.patterns.proxy.remote.states;

import java.io.Serializable;

/**
 * Created by super on 11/2/15.
 */
public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispence();

}
