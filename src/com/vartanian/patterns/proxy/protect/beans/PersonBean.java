package com.vartanian.patterns.proxy.protect.beans;

/**
 * Created by super on 11/3/15.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getRaiting();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setRaiting(int raiting);
}
