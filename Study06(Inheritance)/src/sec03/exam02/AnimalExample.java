package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		Animal animal = null;
		animal = new Dog(); //자동 타입 변환
		animal.sound();
		animal = new Cat(); //자동 타입변 환
		animal.sound();
		System.out.println("----");
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) { //자동 타입 변환 일어남. animal = new Dog(Cat)();
		animal.sound(); //재정의된 메소드 호출
	}

}
