package sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() { //익명 구현 객체 필드 선언(인터페이스)
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	}; //실행문이므로
	
	void method1() { //익명 구현 객체 로컬 변수로 선언
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
