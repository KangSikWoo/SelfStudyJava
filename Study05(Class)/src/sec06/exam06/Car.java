package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { 
		return speed;
	} //getter
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	} //setter
	
	public boolean isStop() {
		return stop;
	} //getter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	} //setter

}
