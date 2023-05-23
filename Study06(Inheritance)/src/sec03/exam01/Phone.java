package sec03.exam01;

//추상 클래스 : 공통된 메소드나 필드를 작성
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
