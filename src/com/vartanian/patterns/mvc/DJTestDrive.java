package com.vartanian.patterns.mvc;

import com.vartanian.patterns.mvc.controllers.impl.BeatController;
import com.vartanian.patterns.mvc.model.impl.BeatModel;
import com.vartanian.patterns.mvc.model.BeatModelInterface;
import com.vartanian.patterns.mvc.controllers.ControllerInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
