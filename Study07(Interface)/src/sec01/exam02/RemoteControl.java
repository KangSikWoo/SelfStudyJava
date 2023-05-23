package sec01.exam02;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //실행하면 자동으로 static final이 붙음
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); //실행하면 자동으로 public abstract가 붙음

}
