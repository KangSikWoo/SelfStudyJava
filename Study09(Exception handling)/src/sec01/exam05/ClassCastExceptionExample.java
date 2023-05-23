package sec01.exam05;

//대입된 객체가 아닌 다른 클래스 타입으로 변환할 때 생기는 예외
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat(); //여기서 예외 발생
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog){ 밑의 예외를 발생지키지 않기 위해서 타입변환을 할때는 항상 instanceof를 사용
		Dog dog = (Dog) animal; //ClassCastException 발생 가능
	//}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
