package LAB.util;

import java.util.TimerTask;

import LAB.LABCanvas;

public class RepaintTimerTask extends TimerTask {
	
	LABCanvas canvas; 
	
	public RepaintTimerTask(LABCanvas canvas) {
		this.canvas = canvas; 
	}
	
	public void run() { canvas.update(); } 
}
