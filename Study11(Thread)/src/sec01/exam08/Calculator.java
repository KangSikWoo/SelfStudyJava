package sec01.exam08;

public class Calculator {
private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory; //매개값을 필드에 저장
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}

}
