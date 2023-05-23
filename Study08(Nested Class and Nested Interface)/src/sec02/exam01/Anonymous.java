package sec02.exam01;

public class Anonymous {
	//필드 초기값으로 대입, 필드 값으로 익명 자식 객체 선언
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; //익명 객체 사용은 실행문이므로 반드시 마지막에 ;붙여야 함.
	
	//로컬 변수 값으로 익명 개체 생성
	void method1() {
		Person localVar = new Person() { 
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

}
