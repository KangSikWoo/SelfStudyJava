package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone(); Phone은 추상 클래스이기 때문에 new연산자로 객체 만드는 것이 불가하다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
