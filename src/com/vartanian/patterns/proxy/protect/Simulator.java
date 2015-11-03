package com.vartanian.patterns.proxy.protect;

import com.vartanian.patterns.proxy.protect.beans.PersonBean;
import com.vartanian.patterns.proxy.protect.beans.impl.PersonBeanImpl;
import com.vartanian.patterns.proxy.protect.handlers.NonOwnerInvocationHandler;
import com.vartanian.patterns.proxy.protect.handlers.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

public class Simulator {

    public static void main(String[] args) {

        Simulator simulator = new Simulator();
        simulator.drive();

    }

    public void drive() {

        PersonBean personBean = new PersonBeanImpl();

        PersonBean ownerProxy = getOwnerProxy(personBean);
        System.out.println("Set name as owner");
        ownerProxy.setName("Joe");
        System.out.println("Seted name as owner: " + ownerProxy.getName());
        System.out.println("Set interests as owner");
        ownerProxy.setInterests("football, tennis");
        System.out.println("Seted interests as owner: " + ownerProxy.getInterests());

        System.out.println("Set raiting as owner");
        try {
            ownerProxy.setRaiting(10);
            System.out.println("Seted raiting as owner: " + ownerProxy.getRaiting());
        }catch (Exception e){
            System.out.println("Can't set raiting for owner");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(personBean);

        System.out.println("Set raiting as non owner");
        nonOwnerProxy.setRaiting(10);
        System.out.println("Seted raiting as non owner: " + nonOwnerProxy.getRaiting());
        System.out.println("Set name as non owner");
        try {
            nonOwnerProxy.setName("Hyu");
            System.out.println("Seted name as non owner: " + nonOwnerProxy.getName());
        }catch (Exception e){
            System.out.println("Can't set name for non owner");
        }

    }

    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    public PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }

}
