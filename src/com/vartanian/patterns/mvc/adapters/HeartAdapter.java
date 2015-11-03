package com.vartanian.patterns.mvc.adapters;

import com.vartanian.patterns.mvc.model.BeatModelInterface;
import com.vartanian.patterns.mvc.model.HeartModelInterface;
import com.vartanian.patterns.mvc.observers.BPMObserver;
import com.vartanian.patterns.mvc.observers.BeatObserver;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
 
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		return heart.getHeartRate();
	}
  
    public void setBPM(int bpm) {}
   
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
    
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}
     
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
  
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
}
