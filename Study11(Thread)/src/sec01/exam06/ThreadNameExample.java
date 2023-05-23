package sec01.exam06;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:" + mainThread.getName());
		
		ThreadA threadA = new ThreadA(); //ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //ThreadB 생성
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();

	}

}
