package sec02.exam03;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); //바로 예외처리 되는 것이 아니라, 잠깐이라도 일시 정지가 되야 InterruptedException 발생시킴
			}
		} catch(InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
