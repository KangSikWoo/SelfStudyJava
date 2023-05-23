package sec02.exam03;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //부모 생성자 호출을 위해선 super()를 사용해야 함.
	}
	
	@Override
	public boolean roll( ) {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "금호타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "금호tire 펑크 ***");
			return false;
		}
	}

}
