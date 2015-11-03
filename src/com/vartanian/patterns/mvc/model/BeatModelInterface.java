package com.vartanian.patterns.mvc.model;

import com.vartanian.patterns.mvc.observers.BPMObserver;
import com.vartanian.patterns.mvc.observers.BeatObserver;

public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
