package sec02.exam07;

public class FloaDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float var1 = 3.14 컴파일 에러 : 자바는 실수를 double을 기본으로 인식하기 때문에 float를 사용하고 싶으면 실수 뒤에 f를 붙여야 한다.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.123456789123456f;
		double var5 = 0.123456789123456;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		double var6 = 3e6; //e+숫자 -> 10의 제곱형태, e는 실수형
		System.out.println(var6);

	}

}
