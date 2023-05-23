package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Singleton obj1 = new Singleton(); -> 컴파일 에러 : Singleton 생성자는 클래스 외부에서 new 로 호출 불가/private기 때문	
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
