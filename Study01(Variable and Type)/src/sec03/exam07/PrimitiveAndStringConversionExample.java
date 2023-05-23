package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 다른 타입으로 형변환 : (Byte, Short, Integer, Long, Float, Double, Boolean).parse(바꾸려는 자료형/맨앞 대문자)(str);
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		
		System.out.println("value1: "+ value1);
		System.out.println("value2: "+ value2);
		
		//다른 타입을 문자열로 변환 : ex) String str = String.valueOf()
		String str = String.valueOf(3.14);
		System.out.println("str: "+ str);

	}

}
