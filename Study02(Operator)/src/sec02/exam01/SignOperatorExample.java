package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result = +x;
		int result2 = -x;
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b; 컴파일 오류 발생 : -,+ 부호 연산자는 int타입이어서 자동으로 int타입으로 바뀐다.
		int result3 = -b;
		System.out.println("result3 = " + result3);

	}

}
