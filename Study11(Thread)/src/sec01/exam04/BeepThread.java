package sec01.exam04;

import java.awt.Toolkit;

//작업 스레드 클래스 정의 

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}

}
