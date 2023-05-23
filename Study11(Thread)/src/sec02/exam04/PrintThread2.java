package sec02.exam04;

//무한 루프
public class PrintThread2 extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { //interrupted() 메소드가 호출되었다면 true를 반환
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
