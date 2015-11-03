package com.vartanian.patterns.proxy.protect.handlers;

import com.vartanian.patterns.proxy.protect.beans.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by super on 11/3/15.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] arg) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("setRaiting")){
                throw new IllegalAccessException();
            }
            return method.invoke(personBean, arg);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
