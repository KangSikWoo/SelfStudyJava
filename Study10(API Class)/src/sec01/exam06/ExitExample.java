package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0); //실행 자체를 멈춰버림.
			}
		}
		System.out.println("마무리 코드"); //실행되지 않음
	}

}
