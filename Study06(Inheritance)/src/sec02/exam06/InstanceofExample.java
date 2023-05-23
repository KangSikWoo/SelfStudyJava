package sec02.exam06;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //강제 타입변환이 가능한지 조사
			Child child = (Child) parent; 
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Chlid로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; //조사를 하지 않아 오류가 뜰 수도 있음
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child(); //자동 타입 변환
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent(); //부모 객체 생성
		method1(parentB);
		method2(parentB); //예외 발생
	}

}
