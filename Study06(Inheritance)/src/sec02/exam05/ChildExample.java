package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data";
		 parent.method3(); 실행 X, 자식 클래스에만 있는 메소드이기 때문
		 */
		
		Child child = (Child) parent; //강제 타입 변환
		child.field2 = "yyy";
		child.method3();

	}

}
