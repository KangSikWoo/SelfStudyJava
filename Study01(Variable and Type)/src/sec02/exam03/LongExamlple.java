package sec02.exam03;

public class LongExamlple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 100000000000000; 컴파일 에러 : 정수 리터럴이 int 타입의 허용 범위 밖이면은 L을 붙여야 함.
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
