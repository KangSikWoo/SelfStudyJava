package sec03.exam02;

public class RunStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//강제 타입 변환 : 작은 허용 범위 타입 = (작은 허용 범위 타입)큰 허용 범위 타입
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
