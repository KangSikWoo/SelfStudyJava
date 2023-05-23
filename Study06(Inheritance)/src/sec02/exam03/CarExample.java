package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
		
		switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankokTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); //자동 타입 변환
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞왼쪽", 13); //자동 타입 변환
				break;
			case 3:
				System.out.println("뒤왼쪽 HankokTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14); //자동 타입 변환
				break;
			case 4:
				System.out.println("뒤오른쪽 HankokTire로 교체");
				car.frontLeftTire = new KumhoTire("뒤오른쪽", 17); //자동 타입 변환
				break;
			}
			System.out.println("-----------------------");
		}
	}

}
