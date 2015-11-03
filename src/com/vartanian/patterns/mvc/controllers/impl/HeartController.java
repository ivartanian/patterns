package com.vartanian.patterns.mvc.controllers.impl;

import com.vartanian.patterns.mvc.controllers.ControllerInterface;
import com.vartanian.patterns.mvc.views.DJView;
import com.vartanian.patterns.mvc.adapters.HeartAdapter;
import com.vartanian.patterns.mvc.model.HeartModelInterface;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;
  
	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}
}



