package sec02.exam03;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //부모 생성자 호출을 위해선 super()를 사용해야 함.
	}
	
	@Override
	public boolean roll( ) {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "한국타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "한국tire 펑크 ***");
			return false;
		}
	}

}
