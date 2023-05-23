package sec02.exam01;

import java.awt.*;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<10; i++) {
			toolkit.beep();
				try {
					Thread.sleep(3000);
				} catch(InterruptedException e) { //일시 정지 상태의 스레드에서 예외 처리를 발생시켜 catch에서 실행 대기 상태가 되거나 종료.
					//interrupt() 메소드가 호출되면 실행
				} 
		}

	}

}
