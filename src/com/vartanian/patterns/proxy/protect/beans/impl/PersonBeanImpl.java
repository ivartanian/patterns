package com.vartanian.patterns.proxy.protect.beans.impl;

import com.vartanian.patterns.proxy.protect.beans.PersonBean;

/**
 * Created by super on 11/3/15.
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int raiting;

    private int raitingCount = 0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getRaiting() {
        if (raitingCount != 0){
            return raiting/raitingCount;
        }
        return 0;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setRaiting(int raiting) {
        this.raiting += raiting;
        this.raitingCount++;
    }
}
