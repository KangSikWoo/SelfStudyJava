package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); //fly함수는 수정되어 자식 클래스에 있는 것을 쓰지만 super.을 붙이면 부모 클래스에 있는 fly함수를 사용한다.
		}
	}
	

}
