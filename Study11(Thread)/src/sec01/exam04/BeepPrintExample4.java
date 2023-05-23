package sec01.exam04;

//작업 스레드를 선언해서 사용하면 코드량이 줄어듦
public class BeepPrintExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(1000); } catch(Exception e) {}
		}

	}

}
