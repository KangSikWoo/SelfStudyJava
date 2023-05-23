package sec02.exam02;

//stop 플래그 사용법
public class StopFlagExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//계속 실행 중을 출력하다 1초 뒤에 자원 정리, 실행 종료를 출력
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		printThread.setStop(true); //스레드를 종료하기 위해 stop필드를 true로 변경

	}

}
