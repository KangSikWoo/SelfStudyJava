package sec02.exam03;

//catch를 작성할 때, 하위 예외 클래스가 상위 예외 클래스보다 위쪽에 위치해야 한다. 그래야 하위 예외 클래스, 상위 예외 클래스가 작동하기 때문.
public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		try {
			String data1= args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
