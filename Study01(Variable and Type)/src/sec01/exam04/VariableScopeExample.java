package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		//int v3 = v1 + v2 + 5; -> v2는 if매소드 안의 변수이기 때문에 if문 밖에서 사용불가, 컴파일 에러 발생
	}

}
