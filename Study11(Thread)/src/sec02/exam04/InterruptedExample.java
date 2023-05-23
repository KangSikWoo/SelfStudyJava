package sec02.exam04;

//일시 정지나 interrupted가 없기 때문에 무한 루프가 돌아갈 것

public class InterruptedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread2();
		thread.start();
		
	}
}