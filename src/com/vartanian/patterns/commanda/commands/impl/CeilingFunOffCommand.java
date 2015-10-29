package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.CeilingFun;

/**
 * Created by super on 10/29/15.
 */
public class CeilingFunOffCommand implements Command {

    private CeilingFun ceilingFun;
    private int prevSpeed;

    public CeilingFunOffCommand(CeilingFun ceilingFun) {
        this.ceilingFun = ceilingFun;
    }

    @Override
    public void execute() {
        this.prevSpeed = ceilingFun.getSpeed();
        ceilingFun.off();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFun.HIGH){
            ceilingFun.high();
        }else if (prevSpeed == CeilingFun.MEDIUM){
            ceilingFun.medium();
        }else if (prevSpeed == CeilingFun.SLOW){
            ceilingFun.slow();
        }else if (prevSpeed == CeilingFun.OFF){
            ceilingFun.off();
        }
    }
}
