package sec05.exam03;

public class Car {
	int speed; // 인스턴트 필드
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	} //인스턴트 메소드
	
	public static void main(Stirng[] args) {
		Car myCar = new Car(); //main()도 정적 메소드기 때문에 반드시 객체 생성 후 인스턴트 필드, 메소드를 이용해야한다.
		myCar.speed = 60;
		myCar.run();
	}
}
