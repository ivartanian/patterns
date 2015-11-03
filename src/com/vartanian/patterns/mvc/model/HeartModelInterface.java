package com.vartanian.patterns.mvc.model;

import com.vartanian.patterns.mvc.observers.BPMObserver;
import com.vartanian.patterns.mvc.observers.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
