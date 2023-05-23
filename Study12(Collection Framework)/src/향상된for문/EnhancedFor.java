package 향상된for문;

/*
 향상된 for문
 - 사용할 변수는 지역변수로 인식된다.
 - 대상은 배열 or 여러 원소를 포함한 자료형이어야 한다.
 장점
 - 간편한, 가독성 좋은 코드
 - 배열 인덱스 문제 해결(ArrayIndexOutOfBoundsException 예외를 피할 수 있다.)
 단점
 -인덱스를 사용하지 못한다.
 -배열이나 ArrayList 값을 사용할 순 있지만 절대 수정할 수는 없다.
 사용 이유
 -배열처럼 여러 원소로 이루어진 집합의 모든 워소에 대해 특정 작업을 반복하기 위해 사용
 (ArrayList 원소 출력, 배열 원소 출력)
 문법
 -for(자료형 변수명 : 배열명){
 	실행문
 	}
 */
public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"1", "2", "3", "4"};
		
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
