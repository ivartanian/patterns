package com.vartanian.patterns.mvc;

import com.vartanian.patterns.mvc.controllers.ControllerInterface;
import com.vartanian.patterns.mvc.controllers.impl.HeartController;
import com.vartanian.patterns.mvc.model.impl.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
