package sec01.exam04;

//문자열을 숫자로 변환할 때, 문자열에 숫자로 변환할 수 없는 것이 들어있을 때 발생하는 예외
public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);

	}

}
