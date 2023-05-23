package sec01.exam06;

import sec01.exam02.RemoteControl;
import sec01.exam03.Audio;
import sec01.exam03.Television;

public class MyClass {
	
	RemoteControl rc = new Television(); //구현 객체
	
	MyClass() {
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}
