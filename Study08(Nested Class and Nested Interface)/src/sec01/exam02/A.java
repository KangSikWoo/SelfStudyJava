package sec01.exam02;


public class A {
	
	// B는 인스턴트 멤버 클래스, C는 정적 멤버 클래스
	
	//인스턴트 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드 초기화
	//static B field3 = new B(); , B는 인스턴스 멤버 클래스임으로
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	class B {}
	
	static class C {}
	
	

}
