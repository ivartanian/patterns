package com.vartanian.patterns.proxy.protect.handlers;

import com.vartanian.patterns.proxy.protect.beans.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by super on 11/3/15.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] arg) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("setRaiting") || method.getName().startsWith("get")){
                return method.invoke(personBean, arg);
            }
            throw new IllegalAccessException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
