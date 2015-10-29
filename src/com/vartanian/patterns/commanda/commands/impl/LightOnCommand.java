package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.Light;

/**
 * Created by super on 10/29/15.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
