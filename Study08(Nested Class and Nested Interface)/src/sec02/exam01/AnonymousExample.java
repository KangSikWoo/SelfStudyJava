package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		//익명 객체 필드사용
		anony.field.wake();
		anony.method1();
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
				
			);

	}

}
