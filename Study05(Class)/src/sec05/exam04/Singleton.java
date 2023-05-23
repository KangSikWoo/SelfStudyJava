package sec05.exam04;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	} //이 메소드를 참조하면 singleton 필드 사용 가능

}
