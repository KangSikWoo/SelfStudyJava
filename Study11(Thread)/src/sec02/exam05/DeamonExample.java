package sec02.exam05;

public class DeamonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {}

		System.out.println("메인 스레드 종료");
	}

}
