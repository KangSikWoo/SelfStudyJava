package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; //value1, 2, 3 모두 자동으로 long형으로 변환된다.
		System.out.println(result);

	}

}