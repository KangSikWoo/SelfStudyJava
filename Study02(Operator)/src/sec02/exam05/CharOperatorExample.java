package sec02.exam05;

public class CharOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2+1; 컴파일 오류 : char변수가 산술 연산에서 사용되면 int형으로 자동으로 변환
		char c3 = (char)(c2+1);
		System.out.println("c1: "+ c1);
		System.out.println("c2: "+ c2);
		System.out.println("c3: "+ c3);
		

	}

}
