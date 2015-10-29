package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.Light;

/**
 * Created by super on 10/29/15.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
