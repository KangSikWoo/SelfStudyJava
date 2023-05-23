package sec04.exam03;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCodae: "+ keyCode);
			if(keyCode == 81) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
