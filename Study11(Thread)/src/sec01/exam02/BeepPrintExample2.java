package sec01.exam02;

//sec01과 다른 점 : sec02는 동시에 소리 스레드와 텍스트 스레드가 실행된다.
public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Runnable beepTask = new BeepTask();
	 Thread thread = new Thread(beepTask);
	 thread.start(); //이 것을 작성해야 thread가 실행된다.
	 
	 for(int i = 0; i<5; i++) {
		 System.out.println("띵");
		 try { Thread.sleep(1000);} 
		 catch(Exception e) {}
	 }

	}

}
